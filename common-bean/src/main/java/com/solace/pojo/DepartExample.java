package com.solace.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("depart_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("depart_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("depart_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("depart_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("depart_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("depart_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("depart_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("depart_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("depart_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("depart_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("depart_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartDescIsNull() {
            addCriterion("depart_desc is null");
            return (Criteria) this;
        }

        public Criteria andDepartDescIsNotNull() {
            addCriterion("depart_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDepartDescEqualTo(String value) {
            addCriterion("depart_desc =", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescNotEqualTo(String value) {
            addCriterion("depart_desc <>", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescGreaterThan(String value) {
            addCriterion("depart_desc >", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescGreaterThanOrEqualTo(String value) {
            addCriterion("depart_desc >=", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescLessThan(String value) {
            addCriterion("depart_desc <", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescLessThanOrEqualTo(String value) {
            addCriterion("depart_desc <=", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescLike(String value) {
            addCriterion("depart_desc like", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescNotLike(String value) {
            addCriterion("depart_desc not like", value, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescIn(List<String> values) {
            addCriterion("depart_desc in", values, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescNotIn(List<String> values) {
            addCriterion("depart_desc not in", values, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescBetween(String value1, String value2) {
            addCriterion("depart_desc between", value1, value2, "departDesc");
            return (Criteria) this;
        }

        public Criteria andDepartDescNotBetween(String value1, String value2) {
            addCriterion("depart_desc not between", value1, value2, "departDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseIsNull() {
            addCriterion("depart_isUse is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseIsNotNull() {
            addCriterion("depart_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseEqualTo(String value) {
            addCriterion("depart_isUse =", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseNotEqualTo(String value) {
            addCriterion("depart_isUse <>", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseGreaterThan(String value) {
            addCriterion("depart_isUse >", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("depart_isUse >=", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseLessThan(String value) {
            addCriterion("depart_isUse <", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseLessThanOrEqualTo(String value) {
            addCriterion("depart_isUse <=", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseLike(String value) {
            addCriterion("depart_isUse like", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseNotLike(String value) {
            addCriterion("depart_isUse not like", value, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseIn(List<String> values) {
            addCriterion("depart_isUse in", values, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseNotIn(List<String> values) {
            addCriterion("depart_isUse not in", values, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseBetween(String value1, String value2) {
            addCriterion("depart_isUse between", value1, value2, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartIsuseNotBetween(String value1, String value2) {
            addCriterion("depart_isUse not between", value1, value2, "departIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartFatherIsNull() {
            addCriterion("depart_father is null");
            return (Criteria) this;
        }

        public Criteria andDepartFatherIsNotNull() {
            addCriterion("depart_father is not null");
            return (Criteria) this;
        }

        public Criteria andDepartFatherEqualTo(String value) {
            addCriterion("depart_father =", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherNotEqualTo(String value) {
            addCriterion("depart_father <>", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherGreaterThan(String value) {
            addCriterion("depart_father >", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherGreaterThanOrEqualTo(String value) {
            addCriterion("depart_father >=", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherLessThan(String value) {
            addCriterion("depart_father <", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherLessThanOrEqualTo(String value) {
            addCriterion("depart_father <=", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherLike(String value) {
            addCriterion("depart_father like", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherNotLike(String value) {
            addCriterion("depart_father not like", value, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherIn(List<String> values) {
            addCriterion("depart_father in", values, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherNotIn(List<String> values) {
            addCriterion("depart_father not in", values, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherBetween(String value1, String value2) {
            addCriterion("depart_father between", value1, value2, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartFatherNotBetween(String value1, String value2) {
            addCriterion("depart_father not between", value1, value2, "departFather");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidIsNull() {
            addCriterion("depart_companyID is null");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidIsNotNull() {
            addCriterion("depart_companyID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidEqualTo(String value) {
            addCriterion("depart_companyID =", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidNotEqualTo(String value) {
            addCriterion("depart_companyID <>", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidGreaterThan(String value) {
            addCriterion("depart_companyID >", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("depart_companyID >=", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidLessThan(String value) {
            addCriterion("depart_companyID <", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidLessThanOrEqualTo(String value) {
            addCriterion("depart_companyID <=", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidLike(String value) {
            addCriterion("depart_companyID like", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidNotLike(String value) {
            addCriterion("depart_companyID not like", value, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidIn(List<String> values) {
            addCriterion("depart_companyID in", values, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidNotIn(List<String> values) {
            addCriterion("depart_companyID not in", values, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidBetween(String value1, String value2) {
            addCriterion("depart_companyID between", value1, value2, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanyidNotBetween(String value1, String value2) {
            addCriterion("depart_companyID not between", value1, value2, "departCompanyid");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameIsNull() {
            addCriterion("depart_companyName is null");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameIsNotNull() {
            addCriterion("depart_companyName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameEqualTo(String value) {
            addCriterion("depart_companyName =", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameNotEqualTo(String value) {
            addCriterion("depart_companyName <>", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameGreaterThan(String value) {
            addCriterion("depart_companyName >", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_companyName >=", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameLessThan(String value) {
            addCriterion("depart_companyName <", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameLessThanOrEqualTo(String value) {
            addCriterion("depart_companyName <=", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameLike(String value) {
            addCriterion("depart_companyName like", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameNotLike(String value) {
            addCriterion("depart_companyName not like", value, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameIn(List<String> values) {
            addCriterion("depart_companyName in", values, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameNotIn(List<String> values) {
            addCriterion("depart_companyName not in", values, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameBetween(String value1, String value2) {
            addCriterion("depart_companyName between", value1, value2, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartCompanynameNotBetween(String value1, String value2) {
            addCriterion("depart_companyName not between", value1, value2, "departCompanyname");
            return (Criteria) this;
        }

        public Criteria andDepartBackupIsNull() {
            addCriterion("depart_backup is null");
            return (Criteria) this;
        }

        public Criteria andDepartBackupIsNotNull() {
            addCriterion("depart_backup is not null");
            return (Criteria) this;
        }

        public Criteria andDepartBackupEqualTo(String value) {
            addCriterion("depart_backup =", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupNotEqualTo(String value) {
            addCriterion("depart_backup <>", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupGreaterThan(String value) {
            addCriterion("depart_backup >", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupGreaterThanOrEqualTo(String value) {
            addCriterion("depart_backup >=", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupLessThan(String value) {
            addCriterion("depart_backup <", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupLessThanOrEqualTo(String value) {
            addCriterion("depart_backup <=", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupLike(String value) {
            addCriterion("depart_backup like", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupNotLike(String value) {
            addCriterion("depart_backup not like", value, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupIn(List<String> values) {
            addCriterion("depart_backup in", values, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupNotIn(List<String> values) {
            addCriterion("depart_backup not in", values, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupBetween(String value1, String value2) {
            addCriterion("depart_backup between", value1, value2, "departBackup");
            return (Criteria) this;
        }

        public Criteria andDepartBackupNotBetween(String value1, String value2) {
            addCriterion("depart_backup not between", value1, value2, "departBackup");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}