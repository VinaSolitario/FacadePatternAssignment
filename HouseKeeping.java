public class HouseKeeping implements HotelService {
    @Override
    public void cleanRoom(int roomNumber) {
        System.out.println("Room " + roomNumber + " will be cleaned shortly.");
    }
   
    @Override
    public void pickUpVehicle(String plateNumber) {
    }

    @Override
    public void requestCart(int numberOfCarts) {
    }
}