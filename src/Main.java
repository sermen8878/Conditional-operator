public class Main {
    public static void main(String[] args) {
        var totalSeats = 102;
        var sittingSeats = 60;
        var passengers = 85;
        if (passengers < sittingSeats) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (passengers < totalSeats) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
}