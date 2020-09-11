package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView cakeView;
    CakeModel cakeModel;

    public CakeController(CakeView mainCakeView){
        cakeView = mainCakeView;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("click", "there was a click");
        cakeModel.candlesLit = !(cakeModel.candlesLit);
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cakeModel.hasCandles = !(cakeModel.hasCandles);
        cakeView.invalidate();
    }
}
