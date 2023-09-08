// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/attached_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AttachedClustersAuthorizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AttachedClustersAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AttachedClusterUser> 
      getAdminUsersList();
  /**
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AttachedClusterUser getAdminUsers(int index);
  /**
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getAdminUsersCount();
  /**
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AttachedClusterUserOrBuilder> 
      getAdminUsersOrBuilderList();
  /**
   * <pre>
   * Required. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AttachedClusterUser admin_users = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.gkemulticloud.v1.AttachedClusterUserOrBuilder getAdminUsersOrBuilder(
      int index);
}
