package com.duplicall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallExample() {
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

        public Criteria andReferenceIdIsNull() {
            addCriterion("REFERENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIdIsNotNull() {
            addCriterion("REFERENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceIdEqualTo(String value) {
            addCriterion("REFERENCE_ID =", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdNotEqualTo(String value) {
            addCriterion("REFERENCE_ID <>", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdGreaterThan(String value) {
            addCriterion("REFERENCE_ID >", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE_ID >=", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdLessThan(String value) {
            addCriterion("REFERENCE_ID <", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE_ID <=", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdLike(String value) {
            addCriterion("REFERENCE_ID like", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdNotLike(String value) {
            addCriterion("REFERENCE_ID not like", value, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdIn(List<String> values) {
            addCriterion("REFERENCE_ID in", values, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdNotIn(List<String> values) {
            addCriterion("REFERENCE_ID not in", values, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdBetween(String value1, String value2) {
            addCriterion("REFERENCE_ID between", value1, value2, "referenceId");
            return (Criteria) this;
        }

        public Criteria andReferenceIdNotBetween(String value1, String value2) {
            addCriterion("REFERENCE_ID not between", value1, value2, "referenceId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Long value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Long value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Long value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Long value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Long value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Long> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Long> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Long value1, Long value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Long value1, Long value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Short value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Short value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Short value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Short value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Short> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Short> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("EXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("EXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(String value) {
            addCriterion("EXTENSION =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(String value) {
            addCriterion("EXTENSION <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(String value) {
            addCriterion("EXTENSION >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(String value) {
            addCriterion("EXTENSION <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLike(String value) {
            addCriterion("EXTENSION like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotLike(String value) {
            addCriterion("EXTENSION not like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<String> values) {
            addCriterion("EXTENSION in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<String> values) {
            addCriterion("EXTENSION not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(String value1, String value2) {
            addCriterion("EXTENSION between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(String value1, String value2) {
            addCriterion("EXTENSION not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andCallerIdIsNull() {
            addCriterion("CALLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCallerIdIsNotNull() {
            addCriterion("CALLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCallerIdEqualTo(String value) {
            addCriterion("CALLER_ID =", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotEqualTo(String value) {
            addCriterion("CALLER_ID <>", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdGreaterThan(String value) {
            addCriterion("CALLER_ID >", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CALLER_ID >=", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLessThan(String value) {
            addCriterion("CALLER_ID <", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLessThanOrEqualTo(String value) {
            addCriterion("CALLER_ID <=", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLike(String value) {
            addCriterion("CALLER_ID like", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotLike(String value) {
            addCriterion("CALLER_ID not like", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdIn(List<String> values) {
            addCriterion("CALLER_ID in", values, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotIn(List<String> values) {
            addCriterion("CALLER_ID not in", values, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdBetween(String value1, String value2) {
            addCriterion("CALLER_ID between", value1, value2, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotBetween(String value1, String value2) {
            addCriterion("CALLER_ID not between", value1, value2, "callerId");
            return (Criteria) this;
        }

        public Criteria andCalledIdIsNull() {
            addCriterion("CALLED_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalledIdIsNotNull() {
            addCriterion("CALLED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalledIdEqualTo(String value) {
            addCriterion("CALLED_ID =", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdNotEqualTo(String value) {
            addCriterion("CALLED_ID <>", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdGreaterThan(String value) {
            addCriterion("CALLED_ID >", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdGreaterThanOrEqualTo(String value) {
            addCriterion("CALLED_ID >=", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdLessThan(String value) {
            addCriterion("CALLED_ID <", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdLessThanOrEqualTo(String value) {
            addCriterion("CALLED_ID <=", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdLike(String value) {
            addCriterion("CALLED_ID like", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdNotLike(String value) {
            addCriterion("CALLED_ID not like", value, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdIn(List<String> values) {
            addCriterion("CALLED_ID in", values, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdNotIn(List<String> values) {
            addCriterion("CALLED_ID not in", values, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdBetween(String value1, String value2) {
            addCriterion("CALLED_ID between", value1, value2, "calledId");
            return (Criteria) this;
        }

        public Criteria andCalledIdNotBetween(String value1, String value2) {
            addCriterion("CALLED_ID not between", value1, value2, "calledId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("AGENT_ID like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("AGENT_ID not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNull() {
            addCriterion("CALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCallTypeIsNotNull() {
            addCriterion("CALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCallTypeEqualTo(String value) {
            addCriterion("CALL_TYPE =", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotEqualTo(String value) {
            addCriterion("CALL_TYPE <>", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThan(String value) {
            addCriterion("CALL_TYPE >", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE >=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThan(String value) {
            addCriterion("CALL_TYPE <", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLessThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE <=", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeLike(String value) {
            addCriterion("CALL_TYPE like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotLike(String value) {
            addCriterion("CALL_TYPE not like", value, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeIn(List<String> values) {
            addCriterion("CALL_TYPE in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotIn(List<String> values) {
            addCriterion("CALL_TYPE not in", values, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeBetween(String value1, String value2) {
            addCriterion("CALL_TYPE between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andCallTypeNotBetween(String value1, String value2) {
            addCriterion("CALL_TYPE not between", value1, value2, "callType");
            return (Criteria) this;
        }

        public Criteria andAnsweredIsNull() {
            addCriterion("ANSWERED is null");
            return (Criteria) this;
        }

        public Criteria andAnsweredIsNotNull() {
            addCriterion("ANSWERED is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweredEqualTo(Short value) {
            addCriterion("ANSWERED =", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredNotEqualTo(Short value) {
            addCriterion("ANSWERED <>", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredGreaterThan(Short value) {
            addCriterion("ANSWERED >", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredGreaterThanOrEqualTo(Short value) {
            addCriterion("ANSWERED >=", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredLessThan(Short value) {
            addCriterion("ANSWERED <", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredLessThanOrEqualTo(Short value) {
            addCriterion("ANSWERED <=", value, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredIn(List<Short> values) {
            addCriterion("ANSWERED in", values, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredNotIn(List<Short> values) {
            addCriterion("ANSWERED not in", values, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredBetween(Short value1, Short value2) {
            addCriterion("ANSWERED between", value1, value2, "answered");
            return (Criteria) this;
        }

        public Criteria andAnsweredNotBetween(Short value1, Short value2) {
            addCriterion("ANSWERED not between", value1, value2, "answered");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeIsNull() {
            addCriterion("CREATE_PTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeIsNotNull() {
            addCriterion("CREATE_PTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeEqualTo(Long value) {
            addCriterion("CREATE_PTIME =", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeNotEqualTo(Long value) {
            addCriterion("CREATE_PTIME <>", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeGreaterThan(Long value) {
            addCriterion("CREATE_PTIME >", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_PTIME >=", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeLessThan(Long value) {
            addCriterion("CREATE_PTIME <", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_PTIME <=", value, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeIn(List<Long> values) {
            addCriterion("CREATE_PTIME in", values, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeNotIn(List<Long> values) {
            addCriterion("CREATE_PTIME not in", values, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeBetween(Long value1, Long value2) {
            addCriterion("CREATE_PTIME between", value1, value2, "createPtime");
            return (Criteria) this;
        }

        public Criteria andCreatePtimeNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_PTIME not between", value1, value2, "createPtime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeIsNull() {
            addCriterion("CONNECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConnectTimeIsNotNull() {
            addCriterion("CONNECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConnectTimeEqualTo(Date value) {
            addCriterion("CONNECT_TIME =", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeNotEqualTo(Date value) {
            addCriterion("CONNECT_TIME <>", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeGreaterThan(Date value) {
            addCriterion("CONNECT_TIME >", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONNECT_TIME >=", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeLessThan(Date value) {
            addCriterion("CONNECT_TIME <", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONNECT_TIME <=", value, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeIn(List<Date> values) {
            addCriterion("CONNECT_TIME in", values, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeNotIn(List<Date> values) {
            addCriterion("CONNECT_TIME not in", values, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeBetween(Date value1, Date value2) {
            addCriterion("CONNECT_TIME between", value1, value2, "connectTime");
            return (Criteria) this;
        }

        public Criteria andConnectTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONNECT_TIME not between", value1, value2, "connectTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("RELEASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("RELEASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("RELEASE_TIME =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("RELEASE_TIME <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("RELEASE_TIME >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("RELEASE_TIME <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("RELEASE_TIME in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("RELEASE_TIME not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("INSERT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("INSERT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("INSERT_TIME =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("INSERT_TIME <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("INSERT_TIME >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("INSERT_TIME <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIME <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("INSERT_TIME in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("INSERT_TIME not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIME not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNull() {
            addCriterion("TRIGGER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIsNotNull() {
            addCriterion("TRIGGER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeEqualTo(Date value) {
            addCriterion("TRIGGER_TIME =", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotEqualTo(Date value) {
            addCriterion("TRIGGER_TIME <>", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThan(Date value) {
            addCriterion("TRIGGER_TIME >", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRIGGER_TIME >=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThan(Date value) {
            addCriterion("TRIGGER_TIME <", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeLessThanOrEqualTo(Date value) {
            addCriterion("TRIGGER_TIME <=", value, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeIn(List<Date> values) {
            addCriterion("TRIGGER_TIME in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotIn(List<Date> values) {
            addCriterion("TRIGGER_TIME not in", values, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeBetween(Date value1, Date value2) {
            addCriterion("TRIGGER_TIME between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andTriggerTimeNotBetween(Date value1, Date value2) {
            addCriterion("TRIGGER_TIME not between", value1, value2, "triggerTime");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNull() {
            addCriterion("START_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStartTypeIsNotNull() {
            addCriterion("START_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStartTypeEqualTo(String value) {
            addCriterion("START_TYPE =", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotEqualTo(String value) {
            addCriterion("START_TYPE <>", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThan(String value) {
            addCriterion("START_TYPE >", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TYPE >=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThan(String value) {
            addCriterion("START_TYPE <", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLessThanOrEqualTo(String value) {
            addCriterion("START_TYPE <=", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeLike(String value) {
            addCriterion("START_TYPE like", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotLike(String value) {
            addCriterion("START_TYPE not like", value, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeIn(List<String> values) {
            addCriterion("START_TYPE in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotIn(List<String> values) {
            addCriterion("START_TYPE not in", values, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeBetween(String value1, String value2) {
            addCriterion("START_TYPE between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andStartTypeNotBetween(String value1, String value2) {
            addCriterion("START_TYPE not between", value1, value2, "startType");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNull() {
            addCriterion("ENCRYPTED is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNotNull() {
            addCriterion("ENCRYPTED is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedEqualTo(Short value) {
            addCriterion("ENCRYPTED =", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotEqualTo(Short value) {
            addCriterion("ENCRYPTED <>", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThan(Short value) {
            addCriterion("ENCRYPTED >", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThanOrEqualTo(Short value) {
            addCriterion("ENCRYPTED >=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThan(Short value) {
            addCriterion("ENCRYPTED <", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThanOrEqualTo(Short value) {
            addCriterion("ENCRYPTED <=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedIn(List<Short> values) {
            addCriterion("ENCRYPTED in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotIn(List<Short> values) {
            addCriterion("ENCRYPTED not in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedBetween(Short value1, Short value2) {
            addCriterion("ENCRYPTED between", value1, value2, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotBetween(Short value1, Short value2) {
            addCriterion("ENCRYPTED not between", value1, value2, "encrypted");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNull() {
            addCriterion("TRANSFER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransferCountIsNotNull() {
            addCriterion("TRANSFER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCountEqualTo(Short value) {
            addCriterion("TRANSFER_COUNT =", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotEqualTo(Short value) {
            addCriterion("TRANSFER_COUNT <>", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThan(Short value) {
            addCriterion("TRANSFER_COUNT >", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANSFER_COUNT >=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThan(Short value) {
            addCriterion("TRANSFER_COUNT <", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountLessThanOrEqualTo(Short value) {
            addCriterion("TRANSFER_COUNT <=", value, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountIn(List<Short> values) {
            addCriterion("TRANSFER_COUNT in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotIn(List<Short> values) {
            addCriterion("TRANSFER_COUNT not in", values, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountBetween(Short value1, Short value2) {
            addCriterion("TRANSFER_COUNT between", value1, value2, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTransferCountNotBetween(Short value1, Short value2) {
            addCriterion("TRANSFER_COUNT not between", value1, value2, "transferCount");
            return (Criteria) this;
        }

        public Criteria andTagCountIsNull() {
            addCriterion("TAG_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTagCountIsNotNull() {
            addCriterion("TAG_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTagCountEqualTo(Short value) {
            addCriterion("TAG_COUNT =", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountNotEqualTo(Short value) {
            addCriterion("TAG_COUNT <>", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountGreaterThan(Short value) {
            addCriterion("TAG_COUNT >", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountGreaterThanOrEqualTo(Short value) {
            addCriterion("TAG_COUNT >=", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountLessThan(Short value) {
            addCriterion("TAG_COUNT <", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountLessThanOrEqualTo(Short value) {
            addCriterion("TAG_COUNT <=", value, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountIn(List<Short> values) {
            addCriterion("TAG_COUNT in", values, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountNotIn(List<Short> values) {
            addCriterion("TAG_COUNT not in", values, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountBetween(Short value1, Short value2) {
            addCriterion("TAG_COUNT between", value1, value2, "tagCount");
            return (Criteria) this;
        }

        public Criteria andTagCountNotBetween(Short value1, Short value2) {
            addCriterion("TAG_COUNT not between", value1, value2, "tagCount");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIsNull() {
            addCriterion("THIRD_PARTY is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIsNotNull() {
            addCriterion("THIRD_PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyEqualTo(String value) {
            addCriterion("THIRD_PARTY =", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotEqualTo(String value) {
            addCriterion("THIRD_PARTY <>", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGreaterThan(String value) {
            addCriterion("THIRD_PARTY >", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY >=", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLessThan(String value) {
            addCriterion("THIRD_PARTY <", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLessThanOrEqualTo(String value) {
            addCriterion("THIRD_PARTY <=", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyLike(String value) {
            addCriterion("THIRD_PARTY like", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotLike(String value) {
            addCriterion("THIRD_PARTY not like", value, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIn(List<String> values) {
            addCriterion("THIRD_PARTY in", values, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotIn(List<String> values) {
            addCriterion("THIRD_PARTY not in", values, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY between", value1, value2, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNotBetween(String value1, String value2) {
            addCriterion("THIRD_PARTY not between", value1, value2, "thirdParty");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("CUSTOM1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("CUSTOM1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("CUSTOM1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("CUSTOM1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("CUSTOM1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("CUSTOM1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOM1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("CUSTOM1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("CUSTOM1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("CUSTOM1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("CUSTOM1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("CUSTOM1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("CUSTOM1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("CUSTOM2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("CUSTOM2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("CUSTOM2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("CUSTOM2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("CUSTOM2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("CUSTOM2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("CUSTOM2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("CUSTOM2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("CUSTOM2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("CUSTOM2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("CUSTOM2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("CUSTOM2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("CUSTOM2 not between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
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