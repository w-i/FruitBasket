package jp.co.icomsys.it21.fruitbasket.dao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by masaharu on 2014/10/14.
 */
public class FBDaoGenerator {

    public static void main(String args[]) throws Exception {
        Schema schema = new Schema(1, "jp.co.icomsys.it21.fruitbasket.dao");

        /**
         *  以下サンプル
         *  ここでテーブルの定義を行い、
         *  build.gradle# run
         *  でコードを app/src/main/java-gen
         *  配下に自動生成する。
         */

        Entity box = schema.addEntity("Box");
        box.addIdProperty();
        box.addStringProperty("name");
        box.addIntProperty("slots");
        box.addStringProperty("description");

        // コード生成
        new DaoGenerator().generateAll(schema, args[0]);
    }
}
