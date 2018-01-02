package com.solace.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerExample() {
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

        public Criteria andPowerIdIsNull() {
            addCriterion("power_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("power_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(String value) {
            addCriterion("power_id =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(String value) {
            addCriterion("power_id <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(String value) {
            addCriterion("power_id >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("power_id >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(String value) {
            addCriterion("power_id <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(String value) {
            addCriterion("power_id <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLike(String value) {
            addCriterion("power_id like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotLike(String value) {
            addCriterion("power_id not like", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<String> values) {
            addCriterion("power_id in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<String> values) {
            addCriterion("power_id not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(String value1, String value2) {
            addCriterion("power_id between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(String value1, String value2) {
            addCriterion("power_id not between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNull() {
            addCriterion("power_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("power_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("power_name =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("power_name <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("power_name >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("power_name >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("power_name <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("power_name <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("power_name like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("power_name not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("power_name in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("power_name not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("power_name between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("power_name not between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerDescIsNull() {
            addCriterion("power_desc is null");
            return (Criteria) this;
        }

        public Criteria andPowerDescIsNotNull() {
            addCriterion("power_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDescEqualTo(String value) {
            addCriterion("power_desc =", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescNotEqualTo(String value) {
            addCriterion("power_desc <>", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescGreaterThan(String value) {
            addCriterion("power_desc >", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescGreaterThanOrEqualTo(String value) {
            addCriterion("power_desc >=", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescLessThan(String value) {
            addCriterion("power_desc <", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescLessThanOrEqualTo(String value) {
            addCriterion("power_desc <=", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescLike(String value) {
            addCriterion("power_desc like", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescNotLike(String value) {
            addCriterion("power_desc not like", value, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescIn(List<String> values) {
            addCriterion("power_desc in", values, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescNotIn(List<String> values) {
            addCriterion("power_desc not in", values, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescBetween(String value1, String value2) {
            addCriterion("power_desc between", value1, value2, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerDescNotBetween(String value1, String value2) {
            addCriterion("power_desc not between", value1, value2, "powerDesc");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIsNull() {
            addCriterion("power_level is null");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIsNotNull() {
            addCriterion("power_level is not null");
            return (Criteria) this;
        }

        public Criteria andPowerLevelEqualTo(String value) {
            addCriterion("power_level =", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotEqualTo(String value) {
            addCriterion("power_level <>", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelGreaterThan(String value) {
            addCriterion("power_level >", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("power_level >=", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelLessThan(String value) {
            addCriterion("power_level <", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelLessThanOrEqualTo(String value) {
            addCriterion("power_level <=", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelLike(String value) {
            addCriterion("power_level like", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotLike(String value) {
            addCriterion("power_level not like", value, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelIn(List<String> values) {
            addCriterion("power_level in", values, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotIn(List<String> values) {
            addCriterion("power_level not in", values, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelBetween(String value1, String value2) {
            addCriterion("power_level between", value1, value2, "powerLevel");
            return (Criteria) this;
        }

        public Criteria andPowerLevelNotBetween(String value1, String value2) {
            addCriterion("power_level not between", value1, value2, "powerLevel");
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

        public Criteria andPowerIsuseIsNull() {
            addCriterion("power_isUse is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseIsNotNull() {
            addCriterion("power_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseEqualTo(String value) {
            addCriterion("power_isUse =", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseNotEqualTo(String value) {
            addCriterion("power_isUse <>", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseGreaterThan(String value) {
            addCriterion("power_isUse >", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("power_isUse >=", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseLessThan(String value) {
            addCriterion("power_isUse <", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseLessThanOrEqualTo(String value) {
            addCriterion("power_isUse <=", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseLike(String value) {
            addCriterion("power_isUse like", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseNotLike(String value) {
            addCriterion("power_isUse not like", value, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseIn(List<String> values) {
            addCriterion("power_isUse in", values, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseNotIn(List<String> values) {
            addCriterion("power_isUse not in", values, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseBetween(String value1, String value2) {
            addCriterion("power_isUse between", value1, value2, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerIsuseNotBetween(String value1, String value2) {
            addCriterion("power_isUse not between", value1, value2, "powerIsuse");
            return (Criteria) this;
        }

        public Criteria andPowerBackupIsNull() {
            addCriterion("power_backup is null");
            return (Criteria) this;
        }

        public Criteria andPowerBackupIsNotNull() {
            addCriterion("power_backup is not null");
            return (Criteria) this;
        }

        public Criteria andPowerBackupEqualTo(String value) {
            addCriterion("power_backup =", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupNotEqualTo(String value) {
            addCriterion("power_backup <>", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupGreaterThan(String value) {
            addCriterion("power_backup >", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupGreaterThanOrEqualTo(String value) {
            addCriterion("power_backup >=", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupLessThan(String value) {
            addCriterion("power_backup <", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupLessThanOrEqualTo(String value) {
            addCriterion("power_backup <=", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupLike(String value) {
            addCriterion("power_backup like", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupNotLike(String value) {
            addCriterion("power_backup not like", value, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupIn(List<String> values) {
            addCriterion("power_backup in", values, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupNotIn(List<String> values) {
            addCriterion("power_backup not in", values, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupBetween(String value1, String value2) {
            addCriterion("power_backup between", value1, value2, "powerBackup");
            return (Criteria) this;
        }

        public Criteria andPowerBackupNotBetween(String value1, String value2) {
            addCriterion("power_backup not between", value1, value2, "powerBackup");
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