# ToolbarActivity
toobar 小工具 自用 單純筆記 :P

XML加元件:
```android
 <android.support.v7.widget.Toolbar
        android:id="@+id/toolbarTitle"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/themeColor"
        android:elevation="1dp"
        android:minHeight="?attr/actionBarSize"
        android:theme="@style/ThemeOverlay.AppCompat.ActionBar"
        app:popupTheme="@style/ThemeOverlay.AppCompat.Light">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="@string/appTitle"
        android:textSize="16sp"
        android:textColor="@android:color/white"
        android:layout_gravity="center_horizontal"
        android:id="@+id/toolbarTitleText" />

        <Button
            android:id="@+id/buttonSearch"
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:layout_marginRight="30dp"
            android:background="@mipmap/search_03"
            android:visibility="invisible"
            android:layout_gravity="end"/>
    </android.support.v7.widget.Toolbar>
```

activity 繼承 ToolbarActivity

```android
public class MainActivity extends ToolbarActivity
```

直接使用方法 setToolbar(String toolbar標題名稱 ,boolean 是否顯示返回的箭頭按鈕);

```android
//繼承自訂的ToolbarActivity 來啟用setToolbar方法自訂Toolbar
        setToolbar("toolbar標題名稱", true);
 ```

