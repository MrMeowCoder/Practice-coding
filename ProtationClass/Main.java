package ProtationClass;

class Company{
    static int anniversary;
    String name;
    int netWorth;


    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + netWorth;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Company other = (Company) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (netWorth != other.netWorth)
            return false;
        return true;
    }


    Company(String name, int netWorth, int anniversary){
        this.name = name;
        this.netWorth = netWorth;
        Company.anniversary = anniversary;
    }
    public String toString(){
        return ("\nIt's been "+anniversary+" years the comany's been running.\nThe name of the company is : "+name+".\nThe net Worth of this comany is : "+netWorth);
    }
}

public class Main{
    public static int hashCode(byte[] value) {
        return switch (value.length) {
            case 1 -> 3;
            case 3 -> 34;
            default -> 54;
        };
    }
    public static void main(String[] args){
        byte[] x = new byte[5];
        for(int i = 0; i<=127; i++){
            x[0] = (byte)i;
            System.out.println( x[0] & 0xff);
            hashCode(x);
        }
        System.out.println();
        for(int i = -128; i<=0; i++){
            x[0] = (byte)i;
            System.out.println( x[0] & 0xff);
            hashCode(x);
        }
    }
}