package com.revia.mvpexperimental.presenter.mainActivity

import com.revia.mvpexperimental.view.MainActivityView

class MainActivityPresenterImpl(var view: MainActivityView): MainActivityPresenter {
    override fun userLogin(userId: String, userPass: String) {
        if(userId == "admin" && userPass == "admin"){
            view.onUserLoginSuccess()
        }else{
            view.onUserLoginFailure()
        }
    }

}