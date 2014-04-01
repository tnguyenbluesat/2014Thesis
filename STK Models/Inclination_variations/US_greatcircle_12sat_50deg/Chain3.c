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
    Object  Satellite/700km_50deg_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_50deg_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_50deg_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_50deg_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1065.3106167034377
    Stop     1954.2473795437581
    Start    7254.4350582339039
    Stop     7874.1329420108805
    Start    13454.868223583753
    Stop     13760.050011160636
    Start    71626.732654495048
    Stop     72357.315596885368
    Start    77697.917437558644
    Stop     78332.275467634885
    Start    83863.432286210678
    Stop     84209.764415561251
    Start    90052.477229228141
    Stop     90123.389243777812
    Start    261836.94848147008
    Stop     261981.12740483196
    Start    268033.36055915011
    Stop     268405.95103656984
    Start    274345.34547119064
    Stop     274664.48384595546
    Start    338446.45770618902
    Stop     338918.4490899028
    Start    344634.93791151716
    Stop     345376.14008086146
    Start    350825.06010820612
    Stop     351664.33567172423
    Start    357060.76551297103
    Stop     357524.61354604631
    Start    415166.99328888836
    Stop     415837.87917885423
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

