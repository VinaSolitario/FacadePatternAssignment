public class Valet implements HotelService {
    @Override
    public void pickUpVehicle(String plateNumber) {
        System.out.println("The vehicle with plate number " + plateNumber + " will be picked up by the valet and parked shortly.");
    }

    @Override
    public void cleanRoom(int roomNumber) {
    }

    @Override
    public void requestCart(int numberOfCarts) {
    }
}