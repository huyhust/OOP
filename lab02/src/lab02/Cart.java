package lab02;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;//khai báo biến cố định
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]//tạo mảng cho đối tượng DigitalVideoDisc    		;
    private int qtyOrdered = 1;//biến lưu trữ số phần tử đang có trong mảng    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {//kiểm tra số phẩn tử hiện tại đã tối đa chưa
            System.out.println("The cart is already full.");
        } else {
            itemsOrdered[qtyOrdered]=disc;//thêm phần tử và update lại số phần tử hiện có
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }
    }
    //phương thức kiểm tra tồn tại phần tử hay không
    public boolean find(DigitalVideoDisc disc) {
    	for(int i=1;i<=qtyOrdered;i++) {
    		if(itemsOrdered[i]==disc) return true;
    	}    	
    	return false;
    } 
    public void remove(DigitalVideoDisc disc) { //phương thức loại bỏ phần tử đã nhập
    	if(find(disc)==true) {
    		for(int i=1;i<=qtyOrdered;i++) {
    			if(itemsOrdered[i]==disc) {
    				itemsOrdered[i]=itemsOrdered[i+1]   	;			
    			} 
    		}   		
    	}   	
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {//phương thức loại bỏ phần tử trong mảng
        if (find(disc)==true) {
            remove(disc);
            qtyOrdered--;//update lại số phần tử hiện có
            System.out.println("The disc has been removed successfully.");
        }    	
    }  
    public float totalCost() {//phương thức tính tổng số tiền
        float total = 0.0f;//biến lưu trữ tổng số tiền
        for (int i = 1; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                total += itemsOrdered[i].getCost();//update lại tổng số tiền
            }
        }
        return total;
    }
}
