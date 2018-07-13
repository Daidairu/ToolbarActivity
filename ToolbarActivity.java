package tw.com.boobi.hjiapplication.Setting;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


import tw.com.boobi.hjiapplication.R;

/**
 * Created by HJI on 2018/6/13.
 */

public abstract class ToolbarActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setToolbar(String string, boolean selecter) {
        setId();
        toolbarSetTitle(string);
        setBackButtonVisible(selecter);
    }

    public void setToolbar(String string, boolean selecter, Drawable icon) {
        setId();
        toolbarSetTitle(string);
        setBackButtonVisible(selecter, icon);
    }

    private void setId() {
        toolbar = findViewById(R.id.toolbarTitle);
        toolbarText = findViewById(R.id.toolbarTitleText);
    }

    //上方標題列更改主題文字
    private void toolbarSetTitle(String string) {
        toolbarText.setText(string);
    }

    //設置箭頭是否顯示，箭頭圖案在這邊直接指定，指定程式註解掉會直接套用預設圖案
    private void setBackButtonVisible(boolean selecter) {

        setSupportActionBar(toolbar);

        //每次顯現箭頭都會出現預設的樣式，使用XML新增style改變預設圖案可能可以排除此狀況
        //假如會顯現箭頭就順便增加監聽事件
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(selecter);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        //這邊使用程式覆蓋預設圖片
        if (selecter) {
            toolbar.setNavigationIcon(R.mipmap.back);
        }
        //設置原本toolbar預設標題是否顯示 (true會有雙重標題)
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    //設置箭頭是否顯示，並且設定箭頭圖案
    private void setBackButtonVisible(boolean selecter, Drawable icon) {

        setSupportActionBar(toolbar);

        //每次顯現箭頭都會出現預設的樣式，使用XML新增style改變預設圖案可能可以排除此狀況
        //假如會顯現箭頭就順便增加監聽事件
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(selecter);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        //這邊使用程式覆蓋預設圖片
        if (selecter) {
            toolbar.setNavigationIcon(icon);
        }
        //設置原本toolbar預設標題是否顯示 (true會有雙重標題)
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
