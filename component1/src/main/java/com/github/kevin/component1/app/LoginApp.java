package com.github.kevin.component1.app;

import android.app.Application;

import com.github.kevin.component1.presenter.LoginService;
import com.github.kevin.componentlib.service.IAppComponent;
import com.github.kevin.componentlib.ServiceFactory;

public class LoginApp extends Application implements IAppComponent {
    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        instance = application;//application是主app的，用于解决上下文问题
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }

}
