package CarServiceStation;

public class CarServiceStation {
    public static void main(String[] args) {
        String carType = "Hatchback";
        String[] serviceCodes = {"BS01", "EF01"};

        BillGenerator.generateBill(carType, serviceCodes);
    }
}