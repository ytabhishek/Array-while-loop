package Array;
class Array1{

    void age(){
        int [] age = new int [3];

        age[0] = 22;
        age[1] = 23;
        age[2] = 24;

        int i = 0;
        while(i<3){
            System.out.println(age[i]);
            i++;
        }
    }

}
public class while_loop {
    public static void main(String[] args) {
        Array1 obj = new Array1();
        obj.age();

    }
}
