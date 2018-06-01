package com.four.entity;

import java.io.Serializable;

public class Housing implements Serializable{

    private static final long serialVersionUID = -6883036966767922014L;

    private Integer id;
    private Integer wuid;
    private String name;
    private String bian;
    private String acreage;
    private String fangprice;
    private String residential;
    private Integer whichlayer;
    private Integer countlayer;
    private Integer areaid;
    private Integer districtid;
    private String position;
    private String photo;
    private Integer busrouteid;
    private Integer metrolineid;
    private Integer schootypeid;
    private Integer schooid;
    private Integer tradetypeid;
    private Integer tradeid;
    private Integer storeid;
    private Integer facingid;
    private String propertyfee;
    private Integer decorateid;
    private Integer orientationid;
    private String time;
    private String equity;
    private Integer featuresid;
    private Integer facilityid;
    private String viewcode;
    private String videoaddress;
    private String vrlink;
    private String introduction;
    private Integer putaway;
    private Integer recommended;
    private String _linkman;
    private String _contactnumber;
    private String _release;
    private Integer serialnumber;
    private Integer sticknumber;
    private String expirationtime;
    private Integer auditstatus;
    private Integer building;
    private Integer element;
    private Integer chamber;
    private String familystructure;
    private String landlordname;
    private String landlordnumber;

    @Override
    public String toString() {
        return "Housing{" +
                "id=" + id +
                ", wuid=" + wuid +
                ", name='" + name + '\'' +
                ", bian='" + bian + '\'' +
                ", acreage='" + acreage + '\'' +
                ", fangprice='" + fangprice + '\'' +
                ", residential='" + residential + '\'' +
                ", whichlayer=" + whichlayer +
                ", countlayer=" + countlayer +
                ", areaid=" + areaid +
                ", districtid=" + districtid +
                ", position='" + position + '\'' +
                ", photo='" + photo + '\'' +
                ", busrouteid=" + busrouteid +
                ", metrolineid=" + metrolineid +
                ", schootypeid=" + schootypeid +
                ", schooid=" + schooid +
                ", tradetypeid=" + tradetypeid +
                ", tradeid=" + tradeid +
                ", storeid=" + storeid +
                ", facingid=" + facingid +
                ", propertyfee='" + propertyfee + '\'' +
                ", decorateid=" + decorateid +
                ", orientationid=" + orientationid +
                ", time='" + time + '\'' +
                ", equity='" + equity + '\'' +
                ", featuresid=" + featuresid +
                ", facilityid=" + facilityid +
                ", viewcode='" + viewcode + '\'' +
                ", videoaddress='" + videoaddress + '\'' +
                ", vrlink='" + vrlink + '\'' +
                ", introduction='" + introduction + '\'' +
                ", putaway=" + putaway +
                ", recommended=" + recommended +
                ", _linkman='" + _linkman + '\'' +
                ", _contactnumber='" + _contactnumber + '\'' +
                ", _release='" + _release + '\'' +
                ", serialnumber=" + serialnumber +
                ", sticknumber=" + sticknumber +
                ", expirationtime='" + expirationtime + '\'' +
                ", auditstatus=" + auditstatus +
                ", building=" + building +
                ", element=" + element +
                ", chamber=" + chamber +
                ", familystructure='" + familystructure + '\'' +
                ", landlordname='" + landlordname + '\'' +
                ", landlordnumber='" + landlordnumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWuid() {
        return wuid;
    }

    public void setWuid(Integer wuid) {
        this.wuid = wuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBian() {
        return bian;
    }

    public void setBian(String bian) {
        this.bian = bian;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public String getFangprice() {
        return fangprice;
    }

    public void setFangprice(String fangprice) {
        this.fangprice = fangprice;
    }

    public String getResidential() {
        return residential;
    }

    public void setResidential(String residential) {
        this.residential = residential;
    }

    public Integer getWhichlayer() {
        return whichlayer;
    }

    public void setWhichlayer(Integer whichlayer) {
        this.whichlayer = whichlayer;
    }

    public Integer getCountlayer() {
        return countlayer;
    }

    public void setCountlayer(Integer countlayer) {
        this.countlayer = countlayer;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getBusrouteid() {
        return busrouteid;
    }

    public void setBusrouteid(Integer busrouteid) {
        this.busrouteid = busrouteid;
    }

    public Integer getMetrolineid() {
        return metrolineid;
    }

    public void setMetrolineid(Integer metrolineid) {
        this.metrolineid = metrolineid;
    }

    public Integer getSchootypeid() {
        return schootypeid;
    }

    public void setSchootypeid(Integer schootypeid) {
        this.schootypeid = schootypeid;
    }

    public Integer getSchooid() {
        return schooid;
    }

    public void setSchooid(Integer schooid) {
        this.schooid = schooid;
    }

    public Integer getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(Integer tradetypeid) {
        this.tradetypeid = tradetypeid;
    }

    public Integer getTradeid() {
        return tradeid;
    }

    public void setTradeid(Integer tradeid) {
        this.tradeid = tradeid;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Integer getFacingid() {
        return facingid;
    }

    public void setFacingid(Integer facingid) {
        this.facingid = facingid;
    }

    public String getPropertyfee() {
        return propertyfee;
    }

    public void setPropertyfee(String propertyfee) {
        this.propertyfee = propertyfee;
    }

    public Integer getDecorateid() {
        return decorateid;
    }

    public void setDecorateid(Integer decorateid) {
        this.decorateid = decorateid;
    }

    public Integer getOrientationid() {
        return orientationid;
    }

    public void setOrientationid(Integer orientationid) {
        this.orientationid = orientationid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEquity() {
        return equity;
    }

    public void setEquity(String equity) {
        this.equity = equity;
    }

    public Integer getFeaturesid() {
        return featuresid;
    }

    public void setFeaturesid(Integer featuresid) {
        this.featuresid = featuresid;
    }

    public Integer getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(Integer facilityid) {
        this.facilityid = facilityid;
    }

    public String getViewcode() {
        return viewcode;
    }

    public void setViewcode(String viewcode) {
        this.viewcode = viewcode;
    }

    public String getVideoaddress() {
        return videoaddress;
    }

    public void setVideoaddress(String videoaddress) {
        this.videoaddress = videoaddress;
    }

    public String getVrlink() {
        return vrlink;
    }

    public void setVrlink(String vrlink) {
        this.vrlink = vrlink;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getPutaway() {
        return putaway;
    }

    public void setPutaway(Integer putaway) {
        this.putaway = putaway;
    }

    public Integer getRecommended() {
        return recommended;
    }

    public void setRecommended(Integer recommended) {
        this.recommended = recommended;
    }

    public String get_linkman() {
        return _linkman;
    }

    public void set_linkman(String _linkman) {
        this._linkman = _linkman;
    }

    public String get_contactnumber() {
        return _contactnumber;
    }

    public void set_contactnumber(String _contactnumber) {
        this._contactnumber = _contactnumber;
    }

    public String get_release() {
        return _release;
    }

    public void set_release(String _release) {
        this._release = _release;
    }

    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Integer getSticknumber() {
        return sticknumber;
    }

    public void setSticknumber(Integer sticknumber) {
        this.sticknumber = sticknumber;
    }

    public String getExpirationtime() {
        return expirationtime;
    }

    public void setExpirationtime(String expirationtime) {
        this.expirationtime = expirationtime;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Integer getChamber() {
        return chamber;
    }

    public void setChamber(Integer chamber) {
        this.chamber = chamber;
    }

    public String getFamilystructure() {
        return familystructure;
    }

    public void setFamilystructure(String familystructure) {
        this.familystructure = familystructure;
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname;
    }

    public String getLandlordnumber() {
        return landlordnumber;
    }

    public void setLandlordnumber(String landlordnumber) {
        this.landlordnumber = landlordnumber;
    }
}
