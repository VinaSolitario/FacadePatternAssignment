public class Cart implements HotelService {
    @Override
    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " luggage carts will be prepared shortly, as requested.");
    }

    @Override
    public void pickUpVehicle(String plateNumber) {
    }

    @Override
    public void cleanRoom(int roomNumber) {
    }
}