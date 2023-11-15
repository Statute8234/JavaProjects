import java.util.Scanner;

public class Chapter8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take values Rect
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        // print
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        // stock
        System.out.print("Create symbol: ");
        String symbol = input.nextLine();
        System.out.print("Create stock name: ");
        String stockName = input.nextLine();
        Stock oracleStock = new Stock(symbol, stockName);
        // take values stock
        System.out.print("Set previous closing price: ");
        double previousClosingPrice = input.nextDouble();
        System.out.print("Set current price: ");
        double currentPrice = input.nextDouble();
        oracleStock.setPreviousClosingPrice(previousClosingPrice);
        oracleStock.setCurrentPrice(currentPrice);
        double changePercent = oracleStock.getChangePercent();
        // print
        System.out.println("Stock Symbol: " + oracleStock.symbol);
        System.out.println("Stock Name: " + oracleStock.stockName);
        System.out.println("Previous Closing Price: $" + oracleStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + oracleStock.getCurrentPrice());
        System.out.printf("Price Change Percentage: %.2f%%\n", changePercent);
        input.close();
    }

    public static class Rectangle {
        public double width;
        public double height;

        public Rectangle() {
            // Default values for length and width
            this.width = 1.0;
            this.height = 1.0;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    public static class Stock {
        public String symbol;
        public String stockName;
        public double previousClosingPrice;
        public double currentPrice;

        public Stock(String symbol, String stockName) {
            this.symbol = symbol;
            this.stockName = stockName;
        }

        public double getPreviousClosingPrice() {
            return previousClosingPrice;
        }

        public void setPreviousClosingPrice(double previousClosingPrice) {
            this.previousClosingPrice = previousClosingPrice;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }

        public double getChangePercent() {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }
    }
}
