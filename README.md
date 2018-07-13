# ToolbarActivity
toobar 小工具

XML加元件:
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
