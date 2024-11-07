package monj;

public class Horner {

    public double horner(int []poly,int x){
        double total = poly[0];
        for(int i=1;i<poly.length;i++){
            total = total * x  + poly[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Horner h = new Horner();
        int []a = {5,4,3,2,1,1};
        double fx = h.horner(a,2);
        System.out.println(fx);
    }

}
