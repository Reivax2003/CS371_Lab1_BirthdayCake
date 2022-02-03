package cs301.birthdaycake;

public class CakeModel {
    private boolean candlesLit = true;
    private boolean hasCandles = true;
    private int candleNum = 2;
    private  boolean hasFrosting = true;

    public boolean getCandlesLit() {
        return  candlesLit;
    }
    public void toggleCandlesLit() {
        candlesLit = !candlesLit;
    }
    public boolean getCandles() {
        return hasCandles;
    }
    public void setHasCandles(boolean enabled) {
        hasCandles = enabled;
    }
    public void setCandleNum(int num) {
        candleNum = num;
    }
    public int getCandleNum() {
        return candleNum;
    }
    public boolean hasFrosting() {
        return hasFrosting;
    }
    public void setFrosting(boolean enabled) {
        hasFrosting = enabled;
    }
}
