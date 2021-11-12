class Box {
    int width,height,depth;
    Box(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public String Volume(){
        int vol=width*height*depth;
        return "The volume of the box is " + vol;
    }
}
class BoxDimension{
    public static void main(String[] args) {
        Box obj = new Box(10,10,20);
        System.out.println("The dimensions of box are:-");
        System.out.println("Depth:-"+obj.depth + " Height:-" + obj.height + " width:-" + obj.width);
        System.out.println("The volume of box is given below");
        System.out.println(obj.Volume());
    }
}