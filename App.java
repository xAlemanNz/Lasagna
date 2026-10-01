class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutosEnHorno) {
        return expectedMinutesInOven() - minutosEnHorno;
    }

    public int preparationTimeInMinutes(int capas) {
        return 2 * capas;
    }

    public int totalTimeInMinutes(int capas, int minutosEnHorno) {
        return preparationTimeInMinutes(capas) + minutosEnHorno;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Tiempo esperado en horno: " + lasagna.expectedMinutesInOven());
        System.out.println("Tiempo restante (con 10 min ya cocinados): " + lasagna.remainingMinutesInOven(10));
        System.out.println("Tiempo de preparación (2 capas): " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Tiempo total (2 capas, 30 min en horno): " + lasagna.totalTimeInMinutes(2, 30));
    }
}