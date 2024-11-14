public class FracNum implements Num {
    private final int chisl;
    private final int znam;

    FracNum(int chisl, int znam) {
        if (znam==0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        if (znam<0) {
            this.chisl=-chisl;
            this.znam=-znam;
        }else {
            this.chisl = chisl;
            this.znam = znam;
        }
    }
    public String toString() {
        return chisl+"/"+znam;
    }
    @Override
    public double doubleValue() {
        return (double) chisl / znam;
    }

}
