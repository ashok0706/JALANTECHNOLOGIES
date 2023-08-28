package CarServiceStation;

import java.util.HashMap;

class CarService {
    private static HashMap<String, Integer> carTypePrices = new HashMap<>();
    private static HashMap<String, Integer> servicePrices = new HashMap<>();

    static {
        carTypePrices.put("Hatchback", 0);
        carTypePrices.put("Sedan", 1);
        carTypePrices.put("SUV", 2);

        servicePrices.put("BS01", 0);
        servicePrices.put("EF01", 1);
        servicePrices.put("CF01", 2);
        servicePrices.put("BF01", 3);
        servicePrices.put("GF01", 4);
    }

    public static int getPrice(String carType, String serviceCode) {
        int carTypeIndex = carTypePrices.get(carType);
        int servicePrice = servicePrices.get(serviceCode);

        int[][] carServicePrices = {
            {2000, 4000, 5000},
            {5000, 8000, 10000},
            {2000, 4000, 6000},
            {1000, 1500, 2500},
            {3000, 6000, 8000}
        };

        return carServicePrices[servicePrice][carTypeIndex];
    }
}
