
public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk(HotelService valet, HotelService houseKeeping, HotelService cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void requestValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeeping(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
