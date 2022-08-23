package com.atguigu.springboot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releaseDate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterionForJDBCDate("releaseDate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("releaseDate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterionForJDBCDate("releaseDate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("releaseDate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterionForJDBCDate("releaseDate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("releaseDate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterionForJDBCDate("releaseDate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("releaseDate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("releaseDate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("releaseDate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNull() {
            addCriterion("likeCount is null");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNotNull() {
            addCriterion("likeCount is not null");
            return (Criteria) this;
        }

        public Criteria andLikecountEqualTo(Integer value) {
            addCriterion("likeCount =", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotEqualTo(Integer value) {
            addCriterion("likeCount <>", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThan(Integer value) {
            addCriterion("likeCount >", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeCount >=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThan(Integer value) {
            addCriterion("likeCount <", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThanOrEqualTo(Integer value) {
            addCriterion("likeCount <=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountIn(List<Integer> values) {
            addCriterion("likeCount in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotIn(List<Integer> values) {
            addCriterion("likeCount not in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountBetween(Integer value1, Integer value2) {
            addCriterion("likeCount between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotBetween(Integer value1, Integer value2) {
            addCriterion("likeCount not between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentCount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentCount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentCount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentCount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentCount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentCount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentCount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentCount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentCount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCount not between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNull() {
            addCriterion("pageViews is null");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNotNull() {
            addCriterion("pageViews is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewsEqualTo(Integer value) {
            addCriterion("pageViews =", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotEqualTo(Integer value) {
            addCriterion("pageViews <>", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThan(Integer value) {
            addCriterion("pageViews >", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageViews >=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThan(Integer value) {
            addCriterion("pageViews <", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("pageViews <=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsIn(List<Integer> values) {
            addCriterion("pageViews in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotIn(List<Integer> values) {
            addCriterion("pageViews not in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsBetween(Integer value1, Integer value2) {
            addCriterion("pageViews between", value1, value2, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("pageViews not between", value1, value2, "pageviews");
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