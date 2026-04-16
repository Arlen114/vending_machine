package model;

public class BillAcceptor {
    private int [] bills = {20,50,100,200};

    public boolean isValidBill(int i){
        for(int bill : bills){
            if (bill == i){
                return true;
            }
        }
        return false;
    }
}
