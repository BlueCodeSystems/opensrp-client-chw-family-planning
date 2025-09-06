package org.smartregister.chw.fp.contract;

import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.smartregister.view.contract.BaseRegisterContract;

import java.io.Serializable;

public interface BaseFpRegisterContract {

    interface View extends BaseRegisterContract.View {
        Presenter presenter();

        Serializable getFormConfig();

        void onFormSaved();
    }

    interface Presenter extends BaseRegisterContract.Presenter {

        void startForm(String formName, String entityId, String payloadType, String dob, @Nullable JSONObject form) throws Exception;

        void saveForm(String jsonString);
    }

    interface Model {

        JSONObject getFormAsJson(String formName, String entityId) throws Exception;
    }

    interface Interactor {

        void saveRegistration(String jsonString, final InteractorCallBack callBack);

    }

    interface InteractorCallBack {

        void onRegistrationSaved();
    }
}
