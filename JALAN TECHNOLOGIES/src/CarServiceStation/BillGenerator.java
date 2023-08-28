package CarServiceStation;

class BillGenerator {
    public static void generateBill(String carType, String[] serviceCodes) {
        int totalBill = 0;

        System.out.println("Type of Car - " + carType);
        System.out.println("Service Codes - " + String.join(", ", serviceCodes));

        for (String serviceCode : serviceCodes) {
            int servicePrice = CarService.getPrice(carType, serviceCode);
            System.out.println("Charges for " + serviceCode + " -  " + servicePrice);
            totalBill += servicePrice;
        }

        if (totalBill > 10000) {
            System.out.println("Complimentary Cleaning Included");
        }

        System.out.println("Total Bill -  " + totalBill);
    }
}
