package com.solace.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("roleid like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("roleid not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescIsNull() {
            addCriterion("user_role_desc is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescIsNotNull() {
            addCriterion("user_role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescEqualTo(String value) {
            addCriterion("user_role_desc =", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescNotEqualTo(String value) {
            addCriterion("user_role_desc <>", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescGreaterThan(String value) {
            addCriterion("user_role_desc >", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("user_role_desc >=", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescLessThan(String value) {
            addCriterion("user_role_desc <", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescLessThanOrEqualTo(String value) {
            addCriterion("user_role_desc <=", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescLike(String value) {
            addCriterion("user_role_desc like", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescNotLike(String value) {
            addCriterion("user_role_desc not like", value, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescIn(List<String> values) {
            addCriterion("user_role_desc in", values, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescNotIn(List<String> values) {
            addCriterion("user_role_desc not in", values, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescBetween(String value1, String value2) {
            addCriterion("user_role_desc between", value1, value2, "userRoleDesc");
            return (Criteria) this;
        }

        public Criteria andUserRoleDescNotBetween(String value1, String value2) {
            addCriterion("user_role_desc not between", value1, value2, "userRoleDesc");
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

        public Criteria andUserRoleIsuseIsNull() {
            addCriterion("user_role_isUse is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseIsNotNull() {
            addCriterion("user_role_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseEqualTo(String value) {
            addCriterion("user_role_isUse =", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseNotEqualTo(String value) {
            addCriterion("user_role_isUse <>", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseGreaterThan(String value) {
            addCriterion("user_role_isUse >", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("user_role_isUse >=", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseLessThan(String value) {
            addCriterion("user_role_isUse <", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseLessThanOrEqualTo(String value) {
            addCriterion("user_role_isUse <=", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseLike(String value) {
            addCriterion("user_role_isUse like", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseNotLike(String value) {
            addCriterion("user_role_isUse not like", value, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseIn(List<String> values) {
            addCriterion("user_role_isUse in", values, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseNotIn(List<String> values) {
            addCriterion("user_role_isUse not in", values, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseBetween(String value1, String value2) {
            addCriterion("user_role_isUse between", value1, value2, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsuseNotBetween(String value1, String value2) {
            addCriterion("user_role_isUse not between", value1, value2, "userRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupIsNull() {
            addCriterion("user_role_backup is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupIsNotNull() {
            addCriterion("user_role_backup is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupEqualTo(String value) {
            addCriterion("user_role_backup =", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupNotEqualTo(String value) {
            addCriterion("user_role_backup <>", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupGreaterThan(String value) {
            addCriterion("user_role_backup >", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupGreaterThanOrEqualTo(String value) {
            addCriterion("user_role_backup >=", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupLessThan(String value) {
            addCriterion("user_role_backup <", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupLessThanOrEqualTo(String value) {
            addCriterion("user_role_backup <=", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupLike(String value) {
            addCriterion("user_role_backup like", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupNotLike(String value) {
            addCriterion("user_role_backup not like", value, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupIn(List<String> values) {
            addCriterion("user_role_backup in", values, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupNotIn(List<String> values) {
            addCriterion("user_role_backup not in", values, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupBetween(String value1, String value2) {
            addCriterion("user_role_backup between", value1, value2, "userRoleBackup");
            return (Criteria) this;
        }

        public Criteria andUserRoleBackupNotBetween(String value1, String value2) {
            addCriterion("user_role_backup not between", value1, value2, "userRoleBackup");
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