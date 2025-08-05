package oops.encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        encap actor = new encap();
        actor.setName("Nitesh choudhary");
        actor.setRating(5);     //setter passing value.
        actor.setView(50000);

        System.out.println(actor.getName());
        System.out.println(actor.getRating()); //getter getting value return.
        System.out.println(actor.getView());
        }
}
class encap{
    private String name;
    private int rating;  //data members(properties)
    private int view;

    public void setName(String n){ name= n ;}
    public void setRating(int r){rating = r ;} //setter
    public void setView(int v){view = v ;}

    public String getName(){return name;}
    public int getRating(){return rating ;}  //getter
    public int getView(){return view ;}
}
