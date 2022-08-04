public class Term
{
    private  boolean wnimsal;
    private int Year;
    private int wnimsaal;

    Term(int year, boolean wnimsal)
    {
        this.Year = year;
        checknimsaal(wnimsal);
    }
    public void checknimsaal(boolean nim){

        if (nim){ wnimsaal = 1;}
        else wnimsaal=2;
    }
    public int getyear(){return Year;}
    public void setyear(int year){this.Year = year;}

    public int getWnimsaal() {
        return wnimsaal;
    }

    public void setWnimsaal(int wnimsaal) {
        this.wnimsaal = wnimsaal;
    }
    public boolean getnimsal(){return wnimsal;}
}
