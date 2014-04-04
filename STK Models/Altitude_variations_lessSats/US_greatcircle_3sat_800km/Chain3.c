stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/800km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/800km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/800km_p1_1/Receiver/adsb_satrcvr2 To Satellite/800km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1083.2330754092529
    Stop     2008.8369279906208
    Start    7393.9836932900444
    Stop     8105.8163581937652
    Start    13672.204415398486
    Stop     14130.410707226878
    Start    19987.103162932377
    Stop     20176.808768246268
    Start    67117.786671899798
    Stop     67812.794984061751
    Start    73168.248128508683
    Stop     74115.717895490685
    Start    79446.767982519566
    Stop     80230.381765648141
    Start    85786.768382777984
    Stop     86248.708250149721
    Start    92102.384043995771
    Stop     92260.135888552119
    Start    189388.05268642434
    Stop     189564.50006445945
    Start    261517.71530517304
    Stop     261815.81452061323
    Start    267802.05156043329
    Stop     268334.30176444125
    Start    274091.79436773498
    Stop     274792.95251320052
    Start    339895.47007728764
    Stop     340615.73457503458
    Start    346224.58247994212
    Stop     347100.33525992173
    Start    352512.12941670162
    Stop     353432.26961910771
    Start    358797.08932861569
    Stop     359428.31209204323
    Start    365310.37679926882
    Stop     365444.82611295313
    Start    412330.82508171792
    Stop     412793.44448887999
    Start    418272.02261617966
    Stop     419231.31089605816
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

