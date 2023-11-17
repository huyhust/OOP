package lab02;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();//khai báo biến để gọi đối tượng mới
        //nhập các đối tượng
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);       
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",87,24.95f);       
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin","Animation","Guy Ritchie",88,18.99f);
        //thêm đối tượng vào mảng
        anOrder.addDigitalVideoDisc(disc1);
        anOrder.addDigitalVideoDisc(disc2);
        anOrder.addDigitalVideoDisc(disc3);
        //in tổng số tiền các đối tượng trong mảng
        System.out.println("total cost is:");
        System.out.println(anOrder.totalCost());
        //loại bỏ đối tượng
        anOrder.removeDigitalVideoDisc(disc2);

        
    }
 


}
