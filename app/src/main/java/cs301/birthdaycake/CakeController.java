package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{
    public boolean lit = true;
    public int numCandles = 2;
    public boolean frosting = true;
    public boolean hasCandles = true;
    private CakeView cakeView;
    private CakeModel cakeModel;
    private Button blowOut = null;

    public CakeController(CakeView cakeView) {
        this.cakeView = cakeView;
        cakeModel = cakeView.getCakeModel();
    }
    public void setBlowOutButton(Button blowOut) {
        this.blowOut = blowOut;
    }

    @Override
    public void onClick(View view) {
        cakeModel.toggleCandlesLit();
        if (blowOut != null) {
            if (cakeModel.getCandlesLit()) {
                blowOut.setText("Blow Out");
            } else {
                blowOut.setText("Re-Light");
            }
        }
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getId() == R.id.candlesSwitch) {
            cakeModel.setHasCandles(b);
        } else if (compoundButton.getId() == R.id.frostingSwitch) {
            cakeModel.setFrosting(b);
        }
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel.setCandleNum(i);
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
