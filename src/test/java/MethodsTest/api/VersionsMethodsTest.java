package MethodsTest.api;

import data_dragon.DataDragon;
import data_dragon.constant.Platform;
import data_dragon.endpoints.api.versions.VersionsMethods;
import data_dragon.utils.ErrorCode;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class VersionsMethodsTest {

    @Test
    public void main() {

        DataDragon dataDragon = new DataDragon(Platform.NA);

        dataDragon.getVersionsList(new VersionsMethods.VersionsListInterface() {
            @Override
            public void onSuccess(String[] versionsList) {
                System.out.println("\nversionsList: \n" + Arrays.toString(versionsList));
            }

            @Override
            public void onErrorCode(ErrorCode errorCode) {
                System.out.println("\nerrorCode: \n" + errorCode.toJson());
            }

            @Override
            public void onIOException(IOException e) {
                System.out.println("\nIOException: \n" + e.getMessage());
            }
        });

        System.out.println("\nthreads:\n" + Thread.activeCount());
    }
}