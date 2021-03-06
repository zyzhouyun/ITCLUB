package com.dream.itclub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepMessageExample() {
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

        public Criteria andRemsgidIsNull() {
            addCriterion("REMSGID is null");
            return (Criteria) this;
        }

        public Criteria andRemsgidIsNotNull() {
            addCriterion("REMSGID is not null");
            return (Criteria) this;
        }

        public Criteria andRemsgidEqualTo(String value) {
            addCriterion("REMSGID =", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidNotEqualTo(String value) {
            addCriterion("REMSGID <>", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidGreaterThan(String value) {
            addCriterion("REMSGID >", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidGreaterThanOrEqualTo(String value) {
            addCriterion("REMSGID >=", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidLessThan(String value) {
            addCriterion("REMSGID <", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidLessThanOrEqualTo(String value) {
            addCriterion("REMSGID <=", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidLike(String value) {
            addCriterion("REMSGID like", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidNotLike(String value) {
            addCriterion("REMSGID not like", value, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidIn(List<String> values) {
            addCriterion("REMSGID in", values, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidNotIn(List<String> values) {
            addCriterion("REMSGID not in", values, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidBetween(String value1, String value2) {
            addCriterion("REMSGID between", value1, value2, "remsgid");
            return (Criteria) this;
        }

        public Criteria andRemsgidNotBetween(String value1, String value2) {
            addCriterion("REMSGID not between", value1, value2, "remsgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNull() {
            addCriterion("MSGID is null");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNotNull() {
            addCriterion("MSGID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgidEqualTo(String value) {
            addCriterion("MSGID =", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotEqualTo(String value) {
            addCriterion("MSGID <>", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThan(String value) {
            addCriterion("MSGID >", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThanOrEqualTo(String value) {
            addCriterion("MSGID >=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThan(String value) {
            addCriterion("MSGID <", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThanOrEqualTo(String value) {
            addCriterion("MSGID <=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLike(String value) {
            addCriterion("MSGID like", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotLike(String value) {
            addCriterion("MSGID not like", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIn(List<String> values) {
            addCriterion("MSGID in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotIn(List<String> values) {
            addCriterion("MSGID not in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidBetween(String value1, String value2) {
            addCriterion("MSGID between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotBetween(String value1, String value2) {
            addCriterion("MSGID not between", value1, value2, "msgid");
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

        public Criteria andRemsgcontentIsNull() {
            addCriterion("REMSGCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentIsNotNull() {
            addCriterion("REMSGCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentEqualTo(String value) {
            addCriterion("REMSGCONTENT =", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentNotEqualTo(String value) {
            addCriterion("REMSGCONTENT <>", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentGreaterThan(String value) {
            addCriterion("REMSGCONTENT >", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("REMSGCONTENT >=", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentLessThan(String value) {
            addCriterion("REMSGCONTENT <", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentLessThanOrEqualTo(String value) {
            addCriterion("REMSGCONTENT <=", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentLike(String value) {
            addCriterion("REMSGCONTENT like", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentNotLike(String value) {
            addCriterion("REMSGCONTENT not like", value, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentIn(List<String> values) {
            addCriterion("REMSGCONTENT in", values, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentNotIn(List<String> values) {
            addCriterion("REMSGCONTENT not in", values, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentBetween(String value1, String value2) {
            addCriterion("REMSGCONTENT between", value1, value2, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgcontentNotBetween(String value1, String value2) {
            addCriterion("REMSGCONTENT not between", value1, value2, "remsgcontent");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeIsNull() {
            addCriterion("REMSGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeIsNotNull() {
            addCriterion("REMSGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeEqualTo(Date value) {
            addCriterion("REMSGTIME =", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeNotEqualTo(Date value) {
            addCriterion("REMSGTIME <>", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeGreaterThan(Date value) {
            addCriterion("REMSGTIME >", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REMSGTIME >=", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeLessThan(Date value) {
            addCriterion("REMSGTIME <", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeLessThanOrEqualTo(Date value) {
            addCriterion("REMSGTIME <=", value, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeIn(List<Date> values) {
            addCriterion("REMSGTIME in", values, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeNotIn(List<Date> values) {
            addCriterion("REMSGTIME not in", values, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeBetween(Date value1, Date value2) {
            addCriterion("REMSGTIME between", value1, value2, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemsgtimeNotBetween(Date value1, Date value2) {
            addCriterion("REMSGTIME not between", value1, value2, "remsgtime");
            return (Criteria) this;
        }

        public Criteria andRemessageuserIsNull() {
            addCriterion("REMESSAGEUSER is null");
            return (Criteria) this;
        }

        public Criteria andRemessageuserIsNotNull() {
            addCriterion("REMESSAGEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andRemessageuserEqualTo(String value) {
            addCriterion("REMESSAGEUSER =", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserNotEqualTo(String value) {
            addCriterion("REMESSAGEUSER <>", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserGreaterThan(String value) {
            addCriterion("REMESSAGEUSER >", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserGreaterThanOrEqualTo(String value) {
            addCriterion("REMESSAGEUSER >=", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserLessThan(String value) {
            addCriterion("REMESSAGEUSER <", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserLessThanOrEqualTo(String value) {
            addCriterion("REMESSAGEUSER <=", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserLike(String value) {
            addCriterion("REMESSAGEUSER like", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserNotLike(String value) {
            addCriterion("REMESSAGEUSER not like", value, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserIn(List<String> values) {
            addCriterion("REMESSAGEUSER in", values, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserNotIn(List<String> values) {
            addCriterion("REMESSAGEUSER not in", values, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserBetween(String value1, String value2) {
            addCriterion("REMESSAGEUSER between", value1, value2, "remessageuser");
            return (Criteria) this;
        }

        public Criteria andRemessageuserNotBetween(String value1, String value2) {
            addCriterion("REMESSAGEUSER not between", value1, value2, "remessageuser");
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