class GoodCat {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    void sniff(){
        if (size == 50) {
            System.out.println("meawo");
        } else if (size > 20){
            System.out.println("meew");
        }  else {
            System.out.println("mew");
        }
    }
}

class GoodCatTestDrive{
    public static void main(String[] args){
        GoodCat one = new GoodCat();
        one.setSize(50);
        GoodCat two = new GoodCat();
        two.setSize(22);
        GoodCat three = new GoodCat();
        three.setSize(three.getSize());
        one.sniff();
        two.sniff();
        three.sniff();
    }
}
