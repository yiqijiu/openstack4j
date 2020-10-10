package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.network.ext.builder.VipBuilder;

/**
 * a vip of a pool
 *
 * @author liujunpeng
 * @author bboyHan
 */
public interface Vip extends ModelEntity, Buildable<VipBuilder> {
    /**
     * @return The IP address of the VIP.
     */
    String getAddress();

    /**
     * @return The administrative state of the VIP. A valid value is true (UP)
     * or false (DOWN).
     */
    boolean isAdminStateUp();

    /**
     * @return connectionLimit.The maximum number of connections allowed for the
     * VIP. Default is -1, meaning no limit.
     */
    Integer getConnectionLimit();

    /**
     * @return Human-readable description for the VIP
     */
    String getDescription();

    /**
     * @return The unique ID for the VIP.
     */
    String getId();

    /**
     * @return Human-readable name for the VIP. Does not have to be unique.
     */
    String getName();

    /**
     * @return The ID of the pool with which the VIP is associated.
     */
    String getPoolId();

    /**
     * @return The protocol of the VIP address. A valid value is TCP, HTTP, or
     * HTTPS.
     */
    Protocol getProtocol();

    /**
     * @return The port on which to listen to client traffic that is associated
     * with the VIP address. A valid value is from 1 to 65535.
     */
    Integer getProtocolPort();

    /**
     * @return SessionPersistence.Session persistence parameters for the VIP.
     * Omit the session_persistence parameter to prevent session
     * persistence. When no session persistence is used, the
     * session_persistence parameter does not appear in the API
     * response. To clear session persistence for the VIP, set the
     * session_persistence parameter to null in a VIP update request.
     */
    SessionPersistence getSessionPersistence();

    /**
     * @return status.The status of the VIP. Indicates whether the VIP is
     * operational.
     */
    String getStatus();

    /**
     * @return The ID of the subnet on which to allocate the VIP address.
     */
    String getSubnetId();

    /**
     * @return The Tenant Id.Owner of the VIP.
     */
    String getTenantId();


}
