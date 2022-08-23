package com.atguigu.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andNichengIsNull() {
            addCriterion("nicheng is null");
            return (Criteria) this;
        }

        public Criteria andNichengIsNotNull() {
            addCriterion("nicheng is not null");
            return (Criteria) this;
        }

        public Criteria andNichengEqualTo(String value) {
            addCriterion("nicheng =", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotEqualTo(String value) {
            addCriterion("nicheng <>", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThan(String value) {
            addCriterion("nicheng >", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThanOrEqualTo(String value) {
            addCriterion("nicheng >=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThan(String value) {
            addCriterion("nicheng <", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThanOrEqualTo(String value) {
            addCriterion("nicheng <=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLike(String value) {
            addCriterion("nicheng like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotLike(String value) {
            addCriterion("nicheng not like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengIn(List<String> values) {
            addCriterion("nicheng in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotIn(List<String> values) {
            addCriterion("nicheng not in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengBetween(String value1, String value2) {
            addCriterion("nicheng between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotBetween(String value1, String value2) {
            addCriterion("nicheng not between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNull() {
            addCriterion("touxiang is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNotNull() {
            addCriterion("touxiang is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangEqualTo(String value) {
            addCriterion("touxiang =", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotEqualTo(String value) {
            addCriterion("touxiang <>", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThan(String value) {
            addCriterion("touxiang >", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("touxiang >=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThan(String value) {
            addCriterion("touxiang <", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThanOrEqualTo(String value) {
            addCriterion("touxiang <=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLike(String value) {
            addCriterion("touxiang like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotLike(String value) {
            addCriterion("touxiang not like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangIn(List<String> values) {
            addCriterion("touxiang in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotIn(List<String> values) {
            addCriterion("touxiang not in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangBetween(String value1, String value2) {
            addCriterion("touxiang between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotBetween(String value1, String value2) {
            addCriterion("touxiang not between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andAihaoIsNull() {
            addCriterion("aihao is null");
            return (Criteria) this;
        }

        public Criteria andAihaoIsNotNull() {
            addCriterion("aihao is not null");
            return (Criteria) this;
        }

        public Criteria andAihaoEqualTo(String value) {
            addCriterion("aihao =", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoNotEqualTo(String value) {
            addCriterion("aihao <>", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoGreaterThan(String value) {
            addCriterion("aihao >", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoGreaterThanOrEqualTo(String value) {
            addCriterion("aihao >=", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoLessThan(String value) {
            addCriterion("aihao <", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoLessThanOrEqualTo(String value) {
            addCriterion("aihao <=", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoLike(String value) {
            addCriterion("aihao like", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoNotLike(String value) {
            addCriterion("aihao not like", value, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoIn(List<String> values) {
            addCriterion("aihao in", values, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoNotIn(List<String> values) {
            addCriterion("aihao not in", values, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoBetween(String value1, String value2) {
            addCriterion("aihao between", value1, value2, "aihao");
            return (Criteria) this;
        }

        public Criteria andAihaoNotBetween(String value1, String value2) {
            addCriterion("aihao not between", value1, value2, "aihao");
            return (Criteria) this;
        }

        public Criteria andHaomaIsNull() {
            addCriterion("haoma is null");
            return (Criteria) this;
        }

        public Criteria andHaomaIsNotNull() {
            addCriterion("haoma is not null");
            return (Criteria) this;
        }

        public Criteria andHaomaEqualTo(String value) {
            addCriterion("haoma =", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotEqualTo(String value) {
            addCriterion("haoma <>", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThan(String value) {
            addCriterion("haoma >", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaGreaterThanOrEqualTo(String value) {
            addCriterion("haoma >=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThan(String value) {
            addCriterion("haoma <", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLessThanOrEqualTo(String value) {
            addCriterion("haoma <=", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaLike(String value) {
            addCriterion("haoma like", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotLike(String value) {
            addCriterion("haoma not like", value, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaIn(List<String> values) {
            addCriterion("haoma in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotIn(List<String> values) {
            addCriterion("haoma not in", values, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaBetween(String value1, String value2) {
            addCriterion("haoma between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andHaomaNotBetween(String value1, String value2) {
            addCriterion("haoma not between", value1, value2, "haoma");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNull() {
            addCriterion("jianjie is null");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNotNull() {
            addCriterion("jianjie is not null");
            return (Criteria) this;
        }

        public Criteria andJianjieEqualTo(String value) {
            addCriterion("jianjie =", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotEqualTo(String value) {
            addCriterion("jianjie <>", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThan(String value) {
            addCriterion("jianjie >", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThanOrEqualTo(String value) {
            addCriterion("jianjie >=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThan(String value) {
            addCriterion("jianjie <", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThanOrEqualTo(String value) {
            addCriterion("jianjie <=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLike(String value) {
            addCriterion("jianjie like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotLike(String value) {
            addCriterion("jianjie not like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieIn(List<String> values) {
            addCriterion("jianjie in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotIn(List<String> values) {
            addCriterion("jianjie not in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieBetween(String value1, String value2) {
            addCriterion("jianjie between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotBetween(String value1, String value2) {
            addCriterion("jianjie not between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andQianmingIsNull() {
            addCriterion("qianming is null");
            return (Criteria) this;
        }

        public Criteria andQianmingIsNotNull() {
            addCriterion("qianming is not null");
            return (Criteria) this;
        }

        public Criteria andQianmingEqualTo(String value) {
            addCriterion("qianming =", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotEqualTo(String value) {
            addCriterion("qianming <>", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingGreaterThan(String value) {
            addCriterion("qianming >", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingGreaterThanOrEqualTo(String value) {
            addCriterion("qianming >=", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLessThan(String value) {
            addCriterion("qianming <", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLessThanOrEqualTo(String value) {
            addCriterion("qianming <=", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingLike(String value) {
            addCriterion("qianming like", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotLike(String value) {
            addCriterion("qianming not like", value, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingIn(List<String> values) {
            addCriterion("qianming in", values, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotIn(List<String> values) {
            addCriterion("qianming not in", values, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingBetween(String value1, String value2) {
            addCriterion("qianming between", value1, value2, "qianming");
            return (Criteria) this;
        }

        public Criteria andQianmingNotBetween(String value1, String value2) {
            addCriterion("qianming not between", value1, value2, "qianming");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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