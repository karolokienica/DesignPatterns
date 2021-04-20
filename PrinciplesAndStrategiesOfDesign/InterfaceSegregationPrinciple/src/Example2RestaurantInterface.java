public interface Example2RestaurantInterface {
    public void acceptOnlineOrder();
    public void takeTelephoneOrder();
    public void payOnline();
    public void walkInCustomerOrder();
    public void payInPerson();
}

class OnlineClientImpl implements Example2RestaurantInterface{
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {
// Not applicable for online order
    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {
// Not applicable for online order
    }

    @Override
    public void payInPerson() {
// Not applicable for online order
    }
}
