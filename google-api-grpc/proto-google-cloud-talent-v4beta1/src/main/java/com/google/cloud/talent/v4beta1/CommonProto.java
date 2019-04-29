// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Certification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Certification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Skill_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Skill_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Interview_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Interview_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Rating_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Rating_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/talent/v4beta1/common.pro"
          + "to\022\033google.cloud.talent.v4beta1\032\034google/"
          + "api/annotations.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\036google/protobuf/wrappers"
          + ".proto\032\026google/type/date.proto\032\030google/t"
          + "ype/latlng.proto\032\027google/type/money.prot"
          + "o\032 google/type/postal_address.proto\032\033goo"
          + "gle/type/timeofday.proto\"n\n\016TimestampRan"
          + "ge\022.\n\nstart_time\030\001 \001(\0132\032.google.protobuf"
          + ".Timestamp\022,\n\010end_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\"\267\003\n\010Location\022I\n\rlocatio"
          + "n_type\030\001 \001(\01622.google.cloud.talent.v4bet"
          + "a1.Location.LocationType\0222\n\016postal_addre"
          + "ss\030\002 \001(\0132\032.google.type.PostalAddress\022$\n\007"
          + "lat_lng\030\003 \001(\0132\023.google.type.LatLng\022\024\n\014ra"
          + "dius_miles\030\004 \001(\001\"\357\001\n\014LocationType\022\035\n\031LOC"
          + "ATION_TYPE_UNSPECIFIED\020\000\022\013\n\007COUNTRY\020\001\022\027\n"
          + "\023ADMINISTRATIVE_AREA\020\002\022\033\n\027SUB_ADMINISTRA"
          + "TIVE_AREA\020\003\022\014\n\010LOCALITY\020\004\022\017\n\013POSTAL_CODE"
          + "\020\005\022\020\n\014SUB_LOCALITY\020\006\022\022\n\016SUB_LOCALITY_1\020\007"
          + "\022\022\n\016SUB_LOCALITY_2\020\010\022\020\n\014NEIGHBORHOOD\020\t\022\022"
          + "\n\016STREET_ADDRESS\020\n\"\237\001\n\017RequestMetadata\022\016"
          + "\n\006domain\030\001 \001(\t\022\022\n\nsession_id\030\002 \001(\t\022\017\n\007us"
          + "er_id\030\003 \001(\t\022\031\n\021allow_missing_ids\030\004 \001(\010\022<"
          + "\n\013device_info\030\005 \001(\0132\'.google.cloud.talen"
          + "t.v4beta1.DeviceInfo\"&\n\020ResponseMetadata"
          + "\022\022\n\nrequest_id\030\001 \001(\t\"\317\001\n\nDeviceInfo\022G\n\013d"
          + "evice_type\030\001 \001(\01622.google.cloud.talent.v"
          + "4beta1.DeviceInfo.DeviceType\022\n\n\002id\030\002 \001(\t"
          + "\"l\n\nDeviceType\022\033\n\027DEVICE_TYPE_UNSPECIFIE"
          + "D\020\000\022\007\n\003WEB\020\001\022\016\n\nMOBILE_WEB\020\002\022\013\n\007ANDROID\020"
          + "\003\022\007\n\003IOS\020\004\022\007\n\003BOT\020\005\022\t\n\005OTHER\020\006\"Q\n\017Custom"
          + "Attribute\022\025\n\rstring_values\030\001 \003(\t\022\023\n\013long"
          + "_values\030\002 \003(\003\022\022\n\nfilterable\030\003 \001(\010\"W\n\022Spe"
          + "llingCorrection\022\021\n\tcorrected\030\001 \001(\010\022\026\n\016co"
          + "rrected_text\030\002 \001(\t\022\026\n\016corrected_html\030\003 \001"
          + "(\t\"\234\t\n\020CompensationInfo\022P\n\007entries\030\001 \003(\013"
          + "2?.google.cloud.talent.v4beta1.Compensat"
          + "ionInfo.CompensationEntry\022k\n\"annualized_"
          + "base_compensation_range\030\002 \001(\0132?.google.c"
          + "loud.talent.v4beta1.CompensationInfo.Com"
          + "pensationRange\022l\n#annualized_total_compe"
          + "nsation_range\030\003 \001(\0132?.google.cloud.talen"
          + "t.v4beta1.CompensationInfo.CompensationR"
          + "ange\032\222\003\n\021CompensationEntry\022L\n\004type\030\001 \001(\016"
          + "2>.google.cloud.talent.v4beta1.Compensat"
          + "ionInfo.CompensationType\022L\n\004unit\030\002 \001(\0162>"
          + ".google.cloud.talent.v4beta1.Compensatio"
          + "nInfo.CompensationUnit\022$\n\006amount\030\003 \001(\0132\022"
          + ".google.type.MoneyH\000\022P\n\005range\030\004 \001(\0132?.go"
          + "ogle.cloud.talent.v4beta1.CompensationIn"
          + "fo.CompensationRangeH\000\022\023\n\013description\030\005 "
          + "\001(\t\022=\n\027expected_units_per_year\030\006 \001(\0132\034.g"
          + "oogle.protobuf.DoubleValueB\025\n\023compensati"
          + "on_amount\032o\n\021CompensationRange\022,\n\020max_co"
          + "mpensation\030\002 \001(\0132\022.google.type.Money\022,\n\020"
          + "min_compensation\030\001 \001(\0132\022.google.type.Mon"
          + "ey\"\265\001\n\020CompensationType\022!\n\035COMPENSATION_"
          + "TYPE_UNSPECIFIED\020\000\022\010\n\004BASE\020\001\022\t\n\005BONUS\020\002\022"
          + "\021\n\rSIGNING_BONUS\020\003\022\n\n\006EQUITY\020\004\022\022\n\016PROFIT"
          + "_SHARING\020\005\022\017\n\013COMMISSIONS\020\006\022\010\n\004TIPS\020\007\022\033\n"
          + "\027OTHER_COMPENSATION_TYPE\020\010\"\234\001\n\020Compensat"
          + "ionUnit\022!\n\035COMPENSATION_UNIT_UNSPECIFIED"
          + "\020\000\022\n\n\006HOURLY\020\001\022\t\n\005DAILY\020\002\022\n\n\006WEEKLY\020\003\022\013\n"
          + "\007MONTHLY\020\004\022\n\n\006YEARLY\020\005\022\014\n\010ONE_TIME\020\006\022\033\n\027"
          + "OTHER_COMPENSATION_UNIT\020\007\"\236\001\n\rCertificat"
          + "ion\022\024\n\014display_name\030\001 \001(\t\022\'\n\014acquire_dat"
          + "e\030\002 \001(\0132\021.google.type.Date\022&\n\013expire_dat"
          + "e\030\003 \001(\0132\021.google.type.Date\022\021\n\tauthority\030"
          + "\004 \001(\t\022\023\n\013description\030\005 \001(\t\"\270\001\n\005Skill\022\024\n\014"
          + "display_name\030\001 \001(\t\022)\n\016last_used_date\030\002 \001"
          + "(\0132\021.google.type.Date\022A\n\005level\030\003 \001(\01622.g"
          + "oogle.cloud.talent.v4beta1.SkillProficie"
          + "ncyLevel\022\017\n\007context\030\004 \001(\t\022\032\n\022skill_name_"
          + "snippet\030\005 \001(\t\"w\n\tInterview\0223\n\006rating\030\006 \001"
          + "(\0132#.google.cloud.talent.v4beta1.Rating\022"
          + "5\n\007outcome\030\007 \001(\0162$.google.cloud.talent.v"
          + "4beta1.Outcome\"E\n\006Rating\022\017\n\007overall\030\001 \001("
          + "\001\022\013\n\003min\030\002 \001(\001\022\013\n\003max\030\003 \001(\001\022\020\n\010interval\030"
          + "\004 \001(\001*y\n\013CompanySize\022\034\n\030COMPANY_SIZE_UNS"
          + "PECIFIED\020\000\022\010\n\004MINI\020\001\022\t\n\005SMALL\020\002\022\013\n\007SMEDI"
          + "UM\020\003\022\n\n\006MEDIUM\020\004\022\007\n\003BIG\020\005\022\n\n\006BIGGER\020\006\022\t\n"
          + "\005GIANT\020\007*\342\001\n\nJobBenefit\022\033\n\027JOB_BENEFIT_U"
          + "NSPECIFIED\020\000\022\016\n\nCHILD_CARE\020\001\022\n\n\006DENTAL\020\002"
          + "\022\024\n\020DOMESTIC_PARTNER\020\003\022\022\n\016FLEXIBLE_HOURS"
          + "\020\004\022\013\n\007MEDICAL\020\005\022\022\n\016LIFE_INSURANCE\020\006\022\022\n\016P"
          + "ARENTAL_LEAVE\020\007\022\023\n\017RETIREMENT_PLAN\020\010\022\r\n\t"
          + "SICK_DAYS\020\t\022\014\n\010VACATION\020\n\022\n\n\006VISION\020\013*\216\002"
          + "\n\nDegreeType\022\033\n\027DEGREE_TYPE_UNSPECIFIED\020"
          + "\000\022\025\n\021PRIMARY_EDUCATION\020\001\022\035\n\031LOWER_SECOND"
          + "ARY_EDUCATION\020\002\022\035\n\031UPPER_SECONDARY_EDUCA"
          + "TION\020\003\022\034\n\030ADULT_REMEDIAL_EDUCATION\020\004\022\034\n\030"
          + "ASSOCIATES_OR_EQUIVALENT\020\005\022\033\n\027BACHELORS_"
          + "OR_EQUIVALENT\020\006\022\031\n\025MASTERS_OR_EQUIVALENT"
          + "\020\007\022\032\n\026DOCTORAL_OR_EQUIVALENT\020\010*\334\001\n\016Emplo"
          + "ymentType\022\037\n\033EMPLOYMENT_TYPE_UNSPECIFIED"
          + "\020\000\022\r\n\tFULL_TIME\020\001\022\r\n\tPART_TIME\020\002\022\016\n\nCONT"
          + "RACTOR\020\003\022\024\n\020CONTRACT_TO_HIRE\020\004\022\r\n\tTEMPOR"
          + "ARY\020\005\022\n\n\006INTERN\020\006\022\r\n\tVOLUNTEER\020\007\022\014\n\010PER_"
          + "DIEM\020\010\022\022\n\016FLY_IN_FLY_OUT\020\t\022\031\n\025OTHER_EMPL"
          + "OYMENT_TYPE\020\n*q\n\010JobLevel\022\031\n\025JOB_LEVEL_U"
          + "NSPECIFIED\020\000\022\017\n\013ENTRY_LEVEL\020\001\022\017\n\013EXPERIE"
          + "NCED\020\002\022\013\n\007MANAGER\020\003\022\014\n\010DIRECTOR\020\004\022\r\n\tEXE"
          + "CUTIVE\020\005*\272\006\n\013JobCategory\022\034\n\030JOB_CATEGORY"
          + "_UNSPECIFIED\020\000\022\032\n\026ACCOUNTING_AND_FINANCE"
          + "\020\001\022\035\n\031ADMINISTRATIVE_AND_OFFICE\020\002\022\035\n\031ADV"
          + "ERTISING_AND_MARKETING\020\003\022\017\n\013ANIMAL_CARE\020"
          + "\004\022\032\n\026ART_FASHION_AND_DESIGN\020\005\022\027\n\023BUSINES"
          + "S_OPERATIONS\020\006\022\033\n\027CLEANING_AND_FACILITIE"
          + "S\020\007\022\023\n\017COMPUTER_AND_IT\020\010\022\020\n\014CONSTRUCTION"
          + "\020\t\022\024\n\020CUSTOMER_SERVICE\020\n\022\r\n\tEDUCATION\020\013\022"
          + "\034\n\030ENTERTAINMENT_AND_TRAVEL\020\014\022\030\n\024FARMING"
          + "_AND_OUTDOORS\020\r\022\016\n\nHEALTHCARE\020\016\022\023\n\017HUMAN"
          + "_RESOURCES\020\017\022\'\n#INSTALLATION_MAINTENANCE"
          + "_AND_REPAIR\020\020\022\t\n\005LEGAL\020\021\022\016\n\nMANAGEMENT\020\022"
          + "\022\037\n\033MANUFACTURING_AND_WAREHOUSE\020\023\022$\n MED"
          + "IA_COMMUNICATIONS_AND_WRITING\020\024\022\026\n\022OIL_G"
          + "AS_AND_MINING\020\025\022\036\n\032PERSONAL_CARE_AND_SER"
          + "VICES\020\026\022\027\n\023PROTECTIVE_SERVICES\020\027\022\017\n\013REAL"
          + "_ESTATE\020\030\022\036\n\032RESTAURANT_AND_HOSPITALITY\020"
          + "\031\022\024\n\020SALES_AND_RETAIL\020\032\022\033\n\027SCIENCE_AND_E"
          + "NGINEERING\020\033\022\"\n\036SOCIAL_SERVICES_AND_NON_"
          + "PROFIT\020\034\022!\n\035SPORTS_FITNESS_AND_RECREATIO"
          + "N\020\035\022 \n\034TRANSPORTATION_AND_LOGISTICS\020\036*e\n"
          + "\rPostingRegion\022\036\n\032POSTING_REGION_UNSPECI"
          + "FIED\020\000\022\027\n\023ADMINISTRATIVE_AREA\020\001\022\n\n\006NATIO"
          + "N\020\002\022\017\n\013TELECOMMUTE\020\003*j\n\nVisibility\022\032\n\026VI"
          + "SIBILITY_UNSPECIFIED\020\000\022\020\n\014ACCOUNT_ONLY\020\001"
          + "\022\026\n\022SHARED_WITH_GOOGLE\020\002\022\026\n\022SHARED_WITH_"
          + "PUBLIC\020\003*Z\n\020ContactInfoUsage\022\"\n\036CONTACT_"
          + "INFO_USAGE_UNSPECIFIED\020\000\022\014\n\010PERSONAL\020\001\022\010"
          + "\n\004WORK\020\002\022\n\n\006SCHOOL\020\003*q\n\020HtmlSanitization"
          + "\022!\n\035HTML_SANITIZATION_UNSPECIFIED\020\000\022\036\n\032H"
          + "TML_SANITIZATION_DISABLED\020\001\022\032\n\026SIMPLE_FO"
          + "RMATTING_ONLY\020\002*c\n\rCommuteMethod\022\036\n\032COMM"
          + "UTE_METHOD_UNSPECIFIED\020\000\022\013\n\007DRIVING\020\001\022\013\n"
          + "\007TRANSIT\020\002\022\013\n\007WALKING\020\003\022\013\n\007CYCLING\020\004*\223\001\n"
          + "\025SkillProficiencyLevel\022\'\n#SKILL_PROFICIE"
          + "NCY_LEVEL_UNSPECIFIED\020\000\022\031\n\025FUNDAMENTAL_A"
          + "WARENESS\020\001\022\n\n\006NOVICE\020\002\022\020\n\014INTERMEDIATE\020\003"
          + "\022\014\n\010ADVANCED\020\004\022\n\n\006EXPERT\020\005*f\n\007Outcome\022\027\n"
          + "\023OUTCOME_UNSPECIFIED\020\000\022\014\n\010POSITIVE\020\001\022\013\n\007"
          + "NEUTRAL\020\002\022\014\n\010NEGATIVE\020\003\022\031\n\025OUTCOME_NOT_A"
          + "VAILABLE\020\004By\n\037com.google.cloud.talent.v4"
          + "beta1B\013CommonProtoP\001ZAgoogle.golang.org/"
          + "genproto/googleapis/cloud/talent/v4beta1"
          + ";talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DateProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.MoneyProto.getDescriptor(),
          com.google.type.PostalAddressProto.getDescriptor(),
          com.google.type.TimeOfDayProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_talent_v4beta1_Location_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Location_descriptor,
            new java.lang.String[] {
              "LocationType", "PostalAddress", "LatLng", "RadiusMiles",
            });
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor,
            new java.lang.String[] {
              "Domain", "SessionId", "UserId", "AllowMissingIds", "DeviceInfo",
            });
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor,
            new java.lang.String[] {
              "RequestId",
            });
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor,
            new java.lang.String[] {
              "DeviceType", "Id",
            });
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor,
            new java.lang.String[] {
              "StringValues", "LongValues", "Filterable",
            });
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor,
            new java.lang.String[] {
              "Corrected", "CorrectedText", "CorrectedHtml",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor,
            new java.lang.String[] {
              "Entries", "AnnualizedBaseCompensationRange", "AnnualizedTotalCompensationRange",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor =
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor,
            new java.lang.String[] {
              "Type",
              "Unit",
              "Amount",
              "Range",
              "Description",
              "ExpectedUnitsPerYear",
              "CompensationAmount",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor =
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor,
            new java.lang.String[] {
              "MaxCompensation", "MinCompensation",
            });
    internal_static_google_cloud_talent_v4beta1_Certification_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_Certification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Certification_descriptor,
            new java.lang.String[] {
              "DisplayName", "AcquireDate", "ExpireDate", "Authority", "Description",
            });
    internal_static_google_cloud_talent_v4beta1_Skill_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4beta1_Skill_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Skill_descriptor,
            new java.lang.String[] {
              "DisplayName", "LastUsedDate", "Level", "Context", "SkillNameSnippet",
            });
    internal_static_google_cloud_talent_v4beta1_Interview_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4beta1_Interview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Interview_descriptor,
            new java.lang.String[] {
              "Rating", "Outcome",
            });
    internal_static_google_cloud_talent_v4beta1_Rating_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4beta1_Rating_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Rating_descriptor,
            new java.lang.String[] {
              "Overall", "Min", "Max", "Interval",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
