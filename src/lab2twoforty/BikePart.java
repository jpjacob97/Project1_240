
package lab2twoforty;

/**
 *
 * @author jacobpetersen
 */
public class BikePart {
    private String partName;
    private int partNum;
    private double listPrice;
    private double salePrice;
    private boolean isOnSale;
    private int quantity;
    
/**
 * Sets all of the fields for this class.
 * 
     * @param name
     * @param num
     * @param lp
     * @param sp
     * @param sale
     * @param q
 */
    public BikePart(String name, int num, double lp, double sp, boolean sale, int q){
        partName= name;
        partNum=num;
        listPrice=lp;
        salePrice=sp;
        isOnSale=sale;
        quantity=q;
    }
    
    public void setName(String name){
        partName=name;
    }
    public void setNum(int num){
        partNum=num;
    }
    public void setListPrice(double lp){
        listPrice=lp;
    }
    public void setSalePrice(double sp){
        salePrice=sp;
    }
    public void setOnSale(boolean sale){
        isOnSale=sale;
    }
    public void setQuasntity(int q){
        quantity=q;
    }
    
    /**
     * 
     * @return the entire line of info for the part.
     */
    public String get(){
        return (partName+", "+partNum+", "+listPrice+", "+salePrice+", "+isOnSale+", "+quantity);
    }
    
    /**
     * 
     * @return the price of the part.
     */
    public double getPrice(){
        if (isOnSale==true){
            return salePrice;
        }
        else
            return listPrice;
    }
    
    
}
