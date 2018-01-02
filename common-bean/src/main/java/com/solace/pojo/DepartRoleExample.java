package com.solace.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("depart_id like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("depart_id not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescIsNull() {
            addCriterion("depart_role_desc is null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescIsNotNull() {
            addCriterion("depart_role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescEqualTo(String value) {
            addCriterion("depart_role_desc =", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescNotEqualTo(String value) {
            addCriterion("depart_role_desc <>", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescGreaterThan(String value) {
            addCriterion("depart_role_desc >", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("depart_role_desc >=", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescLessThan(String value) {
            addCriterion("depart_role_desc <", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescLessThanOrEqualTo(String value) {
            addCriterion("depart_role_desc <=", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescLike(String value) {
            addCriterion("depart_role_desc like", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescNotLike(String value) {
            addCriterion("depart_role_desc not like", value, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescIn(List<String> values) {
            addCriterion("depart_role_desc in", values, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescNotIn(List<String> values) {
            addCriterion("depart_role_desc not in", values, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescBetween(String value1, String value2) {
            addCriterion("depart_role_desc between", value1, value2, "departRoleDesc");
            return (Criteria) this;
        }

        public Criteria andDepartRoleDescNotBetween(String value1, String value2) {
            addCriterion("depart_role_desc not between", value1, value2, "departRoleDesc");
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

        public Criteria andDepartRoleIsuseIsNull() {
            addCriterion("depart_role_isUse is null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseIsNotNull() {
            addCriterion("depart_role_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseEqualTo(String value) {
            addCriterion("depart_role_isUse =", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseNotEqualTo(String value) {
            addCriterion("depart_role_isUse <>", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseGreaterThan(String value) {
            addCriterion("depart_role_isUse >", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("depart_role_isUse >=", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseLessThan(String value) {
            addCriterion("depart_role_isUse <", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseLessThanOrEqualTo(String value) {
            addCriterion("depart_role_isUse <=", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseLike(String value) {
            addCriterion("depart_role_isUse like", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseNotLike(String value) {
            addCriterion("depart_role_isUse not like", value, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseIn(List<String> values) {
            addCriterion("depart_role_isUse in", values, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseNotIn(List<String> values) {
            addCriterion("depart_role_isUse not in", values, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseBetween(String value1, String value2) {
            addCriterion("depart_role_isUse between", value1, value2, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleIsuseNotBetween(String value1, String value2) {
            addCriterion("depart_role_isUse not between", value1, value2, "departRoleIsuse");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupIsNull() {
            addCriterion("depart_role_backup is null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupIsNotNull() {
            addCriterion("depart_role_backup is not null");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupEqualTo(String value) {
            addCriterion("depart_role_backup =", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupNotEqualTo(String value) {
            addCriterion("depart_role_backup <>", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupGreaterThan(String value) {
            addCriterion("depart_role_backup >", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupGreaterThanOrEqualTo(String value) {
            addCriterion("depart_role_backup >=", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupLessThan(String value) {
            addCriterion("depart_role_backup <", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupLessThanOrEqualTo(String value) {
            addCriterion("depart_role_backup <=", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupLike(String value) {
            addCriterion("depart_role_backup like", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupNotLike(String value) {
            addCriterion("depart_role_backup not like", value, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupIn(List<String> values) {
            addCriterion("depart_role_backup in", values, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupNotIn(List<String> values) {
            addCriterion("depart_role_backup not in", values, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupBetween(String value1, String value2) {
            addCriterion("depart_role_backup between", value1, value2, "departRoleBackup");
            return (Criteria) this;
        }

        public Criteria andDepartRoleBackupNotBetween(String value1, String value2) {
            addCriterion("depart_role_backup not between", value1, value2, "departRoleBackup");
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