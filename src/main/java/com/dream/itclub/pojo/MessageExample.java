package com.dream.itclub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgcontentIsNull() {
            addCriterion("MSGCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNotNull() {
            addCriterion("MSGCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentEqualTo(String value) {
            addCriterion("MSGCONTENT =", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotEqualTo(String value) {
            addCriterion("MSGCONTENT <>", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThan(String value) {
            addCriterion("MSGCONTENT >", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("MSGCONTENT >=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThan(String value) {
            addCriterion("MSGCONTENT <", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThanOrEqualTo(String value) {
            addCriterion("MSGCONTENT <=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLike(String value) {
            addCriterion("MSGCONTENT like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotLike(String value) {
            addCriterion("MSGCONTENT not like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIn(List<String> values) {
            addCriterion("MSGCONTENT in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotIn(List<String> values) {
            addCriterion("MSGCONTENT not in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentBetween(String value1, String value2) {
            addCriterion("MSGCONTENT between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotBetween(String value1, String value2) {
            addCriterion("MSGCONTENT not between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNull() {
            addCriterion("MSGTIME is null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNotNull() {
            addCriterion("MSGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeEqualTo(Date value) {
            addCriterion("MSGTIME =", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotEqualTo(Date value) {
            addCriterion("MSGTIME <>", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThan(Date value) {
            addCriterion("MSGTIME >", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MSGTIME >=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThan(Date value) {
            addCriterion("MSGTIME <", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThanOrEqualTo(Date value) {
            addCriterion("MSGTIME <=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIn(List<Date> values) {
            addCriterion("MSGTIME in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotIn(List<Date> values) {
            addCriterion("MSGTIME not in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeBetween(Date value1, Date value2) {
            addCriterion("MSGTIME between", value1, value2, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotBetween(Date value1, Date value2) {
            addCriterion("MSGTIME not between", value1, value2, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMessageuserIsNull() {
            addCriterion("MESSAGEUSER is null");
            return (Criteria) this;
        }

        public Criteria andMessageuserIsNotNull() {
            addCriterion("MESSAGEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andMessageuserEqualTo(String value) {
            addCriterion("MESSAGEUSER =", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserNotEqualTo(String value) {
            addCriterion("MESSAGEUSER <>", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserGreaterThan(String value) {
            addCriterion("MESSAGEUSER >", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEUSER >=", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserLessThan(String value) {
            addCriterion("MESSAGEUSER <", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEUSER <=", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserLike(String value) {
            addCriterion("MESSAGEUSER like", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserNotLike(String value) {
            addCriterion("MESSAGEUSER not like", value, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserIn(List<String> values) {
            addCriterion("MESSAGEUSER in", values, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserNotIn(List<String> values) {
            addCriterion("MESSAGEUSER not in", values, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserBetween(String value1, String value2) {
            addCriterion("MESSAGEUSER between", value1, value2, "messageuser");
            return (Criteria) this;
        }

        public Criteria andMessageuserNotBetween(String value1, String value2) {
            addCriterion("MESSAGEUSER not between", value1, value2, "messageuser");
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