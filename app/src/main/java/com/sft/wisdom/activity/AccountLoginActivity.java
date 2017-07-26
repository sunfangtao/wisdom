package com.sft.wisdom.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.sft.wisdom.R;
import com.sft.wisdom.base.BActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_account_login)
public class AccountLoginActivity extends BActivity {

    @ViewById
    EditText accountlogin_account_et;
    @ViewById
    EditText accountlogin_password_et;
    @ViewById
    Button accountlogin_login_btn;

    @Click(R.id.accountlogin_login_btn)
    void accountLogin() {
        IndexActivity_.intent(this).flags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK).start();
    }

    @TextChange(R.id.accountlogin_account_et)
    void accounTextChanged(CharSequence s) {
        updateBtnState();
    }

    @TextChange(R.id.accountlogin_password_et)
    void passwordTextChanged(CharSequence s) {
        updateBtnState();
    }

    void updateBtnState() {
        if (TextUtils.isEmpty(accountlogin_account_et.getText()) || TextUtils.isEmpty(accountlogin_password_et.getText())) {
            accountlogin_login_btn.setEnabled(false);
        } else {
            accountlogin_login_btn.setEnabled(true);
        }
    }
}
