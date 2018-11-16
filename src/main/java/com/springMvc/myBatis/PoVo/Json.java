package com.springMvc.myBatis.PoVo;

/**
 * Created by Administrator on 2018/8/13.
 */
public class Json {
    private  String dMoney;
    private String xMoney;
    private String dkMoney;
    private String sMoney;

    Json(){

    }

    public Json(String dMoney, String sMoney,String dkMoney,String xMoney){
        this.dMoney=dMoney;
        this.sMoney=sMoney;
        this.dkMoney=dkMoney;
        this.xMoney=xMoney;
    }


    public String getDkMoney() {
        return dkMoney;
    }

    public void setDkMoney(String dkMoney) {
        this.dkMoney = dkMoney;
    }

    public String getsMoney() {
        return sMoney;
    }

    public void setsMoney(String sMoney) {
        this.sMoney = sMoney;
    }



    public String getdMoney() {
        return dMoney;
    }

    public void setdMoney(String dMoney) {
        this.dMoney = dMoney;
    }

    public String getxMoney() {
        return xMoney;
    }

    public void setxMoney(String xMoney) {
        this.xMoney = xMoney;
    }
}
