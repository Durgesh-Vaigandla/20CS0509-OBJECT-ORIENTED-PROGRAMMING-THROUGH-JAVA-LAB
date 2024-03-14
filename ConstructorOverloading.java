class box{
    double witdh,height,depth;
    box(double w,double h,double d){
        witdh = w;
        height = h;
        depth = d;
    }
    box(){
        witdh=height=depth=0;
    }
    box(double len){
        witdh=height=depth=len;
    }
    double volume(){
        return witdh*height*depth;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
     box mybox1 = new box(10,20,15);
     box mybox2 = new box();
     box mycube = new box(7);   
     double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        vol = mycube.volume();
        System.out.println("Volume of mycube is "+vol);
    }
}
