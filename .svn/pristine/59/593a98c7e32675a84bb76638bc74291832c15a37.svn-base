package com.dream.itclub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepComExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepComExample() {
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

        public Criteria andRecomidIsNull() {
            addCriterion("RECOMID is null");
            return (Criteria) this;
        }

        public Criteria andRecomidIsNotNull() {
            addCriterion("RECOMID is not null");
            return (Criteria) this;
        }

        public Criteria andRecomidEqualTo(String value) {
            addCriterion("RECOMID =", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotEqualTo(String value) {
            addCriterion("RECOMID <>", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThan(String value) {
            addCriterion("RECOMID >", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMID >=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThan(String value) {
            addCriterion("RECOMID <", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLessThanOrEqualTo(String value) {
            addCriterion("RECOMID <=", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidLike(String value) {
            addCriterion("RECOMID like", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotLike(String value) {
            addCriterion("RECOMID not like", value, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidIn(List<String> values) {
            addCriterion("RECOMID in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotIn(List<String> values) {
            addCriterion("RECOMID not in", values, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidBetween(String value1, String value2) {
            addCriterion("RECOMID between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andRecomidNotBetween(String value1, String value2) {
            addCriterion("RECOMID not between", value1, value2, "recomid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andComidIsNull() {
            addCriterion("COMID is null");
            return (Criteria) this;
        }

        public Criteria andComidIsNotNull() {
            addCriterion("COMID is not null");
            return (Criteria) this;
        }

        public Criteria andComidEqualTo(String value) {
            addCriterion("COMID =", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotEqualTo(String value) {
            addCriterion("COMID <>", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThan(String value) {
            addCriterion("COMID >", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThanOrEqualTo(String value) {
            addCriterion("COMID >=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThan(String value) {
            addCriterion("COMID <", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThanOrEqualTo(String value) {
            addCriterion("COMID <=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLike(String value) {
            addCriterion("COMID like", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotLike(String value) {
            addCriterion("COMID not like", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidIn(List<String> values) {
            addCriterion("COMID in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotIn(List<String> values) {
            addCriterion("COMID not in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidBetween(String value1, String value2) {
            addCriterion("COMID between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotBetween(String value1, String value2) {
            addCriterion("COMID not between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andRecontentIsNull() {
            addCriterion("RECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRecontentIsNotNull() {
            addCriterion("RECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRecontentEqualTo(String value) {
            addCriterion("RECONTENT =", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotEqualTo(String value) {
            addCriterion("RECONTENT <>", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThan(String value) {
            addCriterion("RECONTENT >", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentGreaterThanOrEqualTo(String value) {
            addCriterion("RECONTENT >=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThan(String value) {
            addCriterion("RECONTENT <", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLessThanOrEqualTo(String value) {
            addCriterion("RECONTENT <=", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentLike(String value) {
            addCriterion("RECONTENT like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotLike(String value) {
            addCriterion("RECONTENT not like", value, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentIn(List<String> values) {
            addCriterion("RECONTENT in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotIn(List<String> values) {
            addCriterion("RECONTENT not in", values, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentBetween(String value1, String value2) {
            addCriterion("RECONTENT between", value1, value2, "recontent");
            return (Criteria) this;
        }

        public Criteria andRecontentNotBetween(String value1, String value2) {
            addCriterion("RECONTENT not between", value1, value2, "recontent");
            return (Criteria) this;
        }

        public Criteria andRegoodnumIsNull() {
            addCriterion("REGOODNUM is null");
            return (Criteria) this;
        }

        public Criteria andRegoodnumIsNotNull() {
            addCriterion("REGOODNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRegoodnumEqualTo(Integer value) {
            addCriterion("REGOODNUM =", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumNotEqualTo(Integer value) {
            addCriterion("REGOODNUM <>", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumGreaterThan(Integer value) {
            addCriterion("REGOODNUM >", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGOODNUM >=", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumLessThan(Integer value) {
            addCriterion("REGOODNUM <", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("REGOODNUM <=", value, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumIn(List<Integer> values) {
            addCriterion("REGOODNUM in", values, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumNotIn(List<Integer> values) {
            addCriterion("REGOODNUM not in", values, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumBetween(Integer value1, Integer value2) {
            addCriterion("REGOODNUM between", value1, value2, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRegoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("REGOODNUM not between", value1, value2, "regoodnum");
            return (Criteria) this;
        }

        public Criteria andRetimeIsNull() {
            addCriterion("RETIME is null");
            return (Criteria) this;
        }

        public Criteria andRetimeIsNotNull() {
            addCriterion("RETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRetimeEqualTo(Date value) {
            addCriterion("RETIME =", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotEqualTo(Date value) {
            addCriterion("RETIME <>", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeGreaterThan(Date value) {
            addCriterion("RETIME >", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RETIME >=", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeLessThan(Date value) {
            addCriterion("RETIME <", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeLessThanOrEqualTo(Date value) {
            addCriterion("RETIME <=", value, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeIn(List<Date> values) {
            addCriterion("RETIME in", values, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotIn(List<Date> values) {
            addCriterion("RETIME not in", values, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeBetween(Date value1, Date value2) {
            addCriterion("RETIME between", value1, value2, "retime");
            return (Criteria) this;
        }

        public Criteria andRetimeNotBetween(Date value1, Date value2) {
            addCriterion("RETIME not between", value1, value2, "retime");
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