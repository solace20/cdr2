package com.solace.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("menu_desc =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("menu_desc <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("menu_desc >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("menu_desc >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("menu_desc <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("menu_desc <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("menu_desc like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("menu_desc not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("menu_desc in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("menu_desc not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("menu_desc between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("menu_desc not between", value1, value2, "menuDesc");
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

        public Criteria andMenuLevelIsNull() {
            addCriterion("menu_level is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("menu_level is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(String value) {
            addCriterion("menu_level =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(String value) {
            addCriterion("menu_level <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(String value) {
            addCriterion("menu_level >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(String value) {
            addCriterion("menu_level >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(String value) {
            addCriterion("menu_level <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(String value) {
            addCriterion("menu_level <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLike(String value) {
            addCriterion("menu_level like", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotLike(String value) {
            addCriterion("menu_level not like", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<String> values) {
            addCriterion("menu_level in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<String> values) {
            addCriterion("menu_level not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(String value1, String value2) {
            addCriterion("menu_level between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(String value1, String value2) {
            addCriterion("menu_level not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuFatherIsNull() {
            addCriterion("menu_father is null");
            return (Criteria) this;
        }

        public Criteria andMenuFatherIsNotNull() {
            addCriterion("menu_father is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFatherEqualTo(String value) {
            addCriterion("menu_father =", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherNotEqualTo(String value) {
            addCriterion("menu_father <>", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherGreaterThan(String value) {
            addCriterion("menu_father >", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherGreaterThanOrEqualTo(String value) {
            addCriterion("menu_father >=", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherLessThan(String value) {
            addCriterion("menu_father <", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherLessThanOrEqualTo(String value) {
            addCriterion("menu_father <=", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherLike(String value) {
            addCriterion("menu_father like", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherNotLike(String value) {
            addCriterion("menu_father not like", value, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherIn(List<String> values) {
            addCriterion("menu_father in", values, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherNotIn(List<String> values) {
            addCriterion("menu_father not in", values, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherBetween(String value1, String value2) {
            addCriterion("menu_father between", value1, value2, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuFatherNotBetween(String value1, String value2) {
            addCriterion("menu_father not between", value1, value2, "menuFather");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("menu_link is null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("menu_link is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("menu_link =", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("menu_link <>", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("menu_link >", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("menu_link >=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("menu_link <", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("menu_link <=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("menu_link like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("menu_link not like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("menu_link in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("menu_link not in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("menu_link between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("menu_link not between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayIsNull() {
            addCriterion("menu_isDisplay is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayIsNotNull() {
            addCriterion("menu_isDisplay is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayEqualTo(String value) {
            addCriterion("menu_isDisplay =", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayNotEqualTo(String value) {
            addCriterion("menu_isDisplay <>", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayGreaterThan(String value) {
            addCriterion("menu_isDisplay >", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayGreaterThanOrEqualTo(String value) {
            addCriterion("menu_isDisplay >=", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayLessThan(String value) {
            addCriterion("menu_isDisplay <", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayLessThanOrEqualTo(String value) {
            addCriterion("menu_isDisplay <=", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayLike(String value) {
            addCriterion("menu_isDisplay like", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayNotLike(String value) {
            addCriterion("menu_isDisplay not like", value, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayIn(List<String> values) {
            addCriterion("menu_isDisplay in", values, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayNotIn(List<String> values) {
            addCriterion("menu_isDisplay not in", values, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayBetween(String value1, String value2) {
            addCriterion("menu_isDisplay between", value1, value2, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuIsdisplayNotBetween(String value1, String value2) {
            addCriterion("menu_isDisplay not between", value1, value2, "menuIsdisplay");
            return (Criteria) this;
        }

        public Criteria andMenuBackupIsNull() {
            addCriterion("menu_backup is null");
            return (Criteria) this;
        }

        public Criteria andMenuBackupIsNotNull() {
            addCriterion("menu_backup is not null");
            return (Criteria) this;
        }

        public Criteria andMenuBackupEqualTo(String value) {
            addCriterion("menu_backup =", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupNotEqualTo(String value) {
            addCriterion("menu_backup <>", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupGreaterThan(String value) {
            addCriterion("menu_backup >", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupGreaterThanOrEqualTo(String value) {
            addCriterion("menu_backup >=", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupLessThan(String value) {
            addCriterion("menu_backup <", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupLessThanOrEqualTo(String value) {
            addCriterion("menu_backup <=", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupLike(String value) {
            addCriterion("menu_backup like", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupNotLike(String value) {
            addCriterion("menu_backup not like", value, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupIn(List<String> values) {
            addCriterion("menu_backup in", values, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupNotIn(List<String> values) {
            addCriterion("menu_backup not in", values, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupBetween(String value1, String value2) {
            addCriterion("menu_backup between", value1, value2, "menuBackup");
            return (Criteria) this;
        }

        public Criteria andMenuBackupNotBetween(String value1, String value2) {
            addCriterion("menu_backup not between", value1, value2, "menuBackup");
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