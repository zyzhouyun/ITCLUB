package com.dream.itclub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(String value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(String value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(String value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(String value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(String value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(String value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLike(String value) {
            addCriterion("BID like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotLike(String value) {
            addCriterion("BID not like", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<String> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<String> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(String value1, String value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(String value1, String value2) {
            addCriterion("BID not between", value1, value2, "bid");
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

        public Criteria andTypeidIsNull() {
            addCriterion("TYPEID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("TYPEID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("TYPEID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("TYPEID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("TYPEID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("TYPEID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("TYPEID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("TYPEID like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("TYPEID not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("TYPEID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("TYPEID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("TYPEID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("TYPEID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNull() {
            addCriterion("BTITLE is null");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNotNull() {
            addCriterion("BTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andBtitleEqualTo(String value) {
            addCriterion("BTITLE =", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotEqualTo(String value) {
            addCriterion("BTITLE <>", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThan(String value) {
            addCriterion("BTITLE >", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThanOrEqualTo(String value) {
            addCriterion("BTITLE >=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThan(String value) {
            addCriterion("BTITLE <", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThanOrEqualTo(String value) {
            addCriterion("BTITLE <=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLike(String value) {
            addCriterion("BTITLE like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotLike(String value) {
            addCriterion("BTITLE not like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleIn(List<String> values) {
            addCriterion("BTITLE in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotIn(List<String> values) {
            addCriterion("BTITLE not in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleBetween(String value1, String value2) {
            addCriterion("BTITLE between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotBetween(String value1, String value2) {
            addCriterion("BTITLE not between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBpvnumIsNull() {
            addCriterion("BPVNUM is null");
            return (Criteria) this;
        }

        public Criteria andBpvnumIsNotNull() {
            addCriterion("BPVNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBpvnumEqualTo(Integer value) {
            addCriterion("BPVNUM =", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumNotEqualTo(Integer value) {
            addCriterion("BPVNUM <>", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumGreaterThan(Integer value) {
            addCriterion("BPVNUM >", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BPVNUM >=", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumLessThan(Integer value) {
            addCriterion("BPVNUM <", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumLessThanOrEqualTo(Integer value) {
            addCriterion("BPVNUM <=", value, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumIn(List<Integer> values) {
            addCriterion("BPVNUM in", values, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumNotIn(List<Integer> values) {
            addCriterion("BPVNUM not in", values, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumBetween(Integer value1, Integer value2) {
            addCriterion("BPVNUM between", value1, value2, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBpvnumNotBetween(Integer value1, Integer value2) {
            addCriterion("BPVNUM not between", value1, value2, "bpvnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumIsNull() {
            addCriterion("BGOODNUM is null");
            return (Criteria) this;
        }

        public Criteria andBgoodnumIsNotNull() {
            addCriterion("BGOODNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBgoodnumEqualTo(Integer value) {
            addCriterion("BGOODNUM =", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumNotEqualTo(Integer value) {
            addCriterion("BGOODNUM <>", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumGreaterThan(Integer value) {
            addCriterion("BGOODNUM >", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BGOODNUM >=", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumLessThan(Integer value) {
            addCriterion("BGOODNUM <", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("BGOODNUM <=", value, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumIn(List<Integer> values) {
            addCriterion("BGOODNUM in", values, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumNotIn(List<Integer> values) {
            addCriterion("BGOODNUM not in", values, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumBetween(Integer value1, Integer value2) {
            addCriterion("BGOODNUM between", value1, value2, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBgoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("BGOODNUM not between", value1, value2, "bgoodnum");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeIsNull() {
            addCriterion("BPUBLISHTIME is null");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeIsNotNull() {
            addCriterion("BPUBLISHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeEqualTo(Date value) {
            addCriterion("BPUBLISHTIME =", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeNotEqualTo(Date value) {
            addCriterion("BPUBLISHTIME <>", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeGreaterThan(Date value) {
            addCriterion("BPUBLISHTIME >", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BPUBLISHTIME >=", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeLessThan(Date value) {
            addCriterion("BPUBLISHTIME <", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("BPUBLISHTIME <=", value, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeIn(List<Date> values) {
            addCriterion("BPUBLISHTIME in", values, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeNotIn(List<Date> values) {
            addCriterion("BPUBLISHTIME not in", values, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeBetween(Date value1, Date value2) {
            addCriterion("BPUBLISHTIME between", value1, value2, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBpublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("BPUBLISHTIME not between", value1, value2, "bpublishtime");
            return (Criteria) this;
        }

        public Criteria andBimgpathIsNull() {
            addCriterion("BIMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andBimgpathIsNotNull() {
            addCriterion("BIMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andBimgpathEqualTo(String value) {
            addCriterion("BIMGPATH =", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotEqualTo(String value) {
            addCriterion("BIMGPATH <>", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathGreaterThan(String value) {
            addCriterion("BIMGPATH >", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("BIMGPATH >=", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLessThan(String value) {
            addCriterion("BIMGPATH <", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLessThanOrEqualTo(String value) {
            addCriterion("BIMGPATH <=", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLike(String value) {
            addCriterion("BIMGPATH like", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotLike(String value) {
            addCriterion("BIMGPATH not like", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathIn(List<String> values) {
            addCriterion("BIMGPATH in", values, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotIn(List<String> values) {
            addCriterion("BIMGPATH not in", values, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathBetween(String value1, String value2) {
            addCriterion("BIMGPATH between", value1, value2, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotBetween(String value1, String value2) {
            addCriterion("BIMGPATH not between", value1, value2, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andInstructionsIsNull() {
            addCriterion("INSTRUCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsIsNotNull() {
            addCriterion("INSTRUCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsEqualTo(String value) {
            addCriterion("INSTRUCTIONS =", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotEqualTo(String value) {
            addCriterion("INSTRUCTIONS <>", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThan(String value) {
            addCriterion("INSTRUCTIONS >", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRUCTIONS >=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThan(String value) {
            addCriterion("INSTRUCTIONS <", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLessThanOrEqualTo(String value) {
            addCriterion("INSTRUCTIONS <=", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsLike(String value) {
            addCriterion("INSTRUCTIONS like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotLike(String value) {
            addCriterion("INSTRUCTIONS not like", value, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsIn(List<String> values) {
            addCriterion("INSTRUCTIONS in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotIn(List<String> values) {
            addCriterion("INSTRUCTIONS not in", values, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsBetween(String value1, String value2) {
            addCriterion("INSTRUCTIONS between", value1, value2, "instructions");
            return (Criteria) this;
        }

        public Criteria andInstructionsNotBetween(String value1, String value2) {
            addCriterion("INSTRUCTIONS not between", value1, value2, "instructions");
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